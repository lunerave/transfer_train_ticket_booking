package com.example.trainticketbooking.service;

import com.example.trainticketbooking.entity.Reservation;
import com.example.trainticketbooking.entity.Seat;
import com.example.trainticketbooking.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private StationRepository stationRepository;

    @Autowired
    private TrainRepository trainRepository;

    public boolean reserve(String userId, Long trainId, Long startStationId, Long endStationId) {
        List<Seat> possibleSeats = seatRepository.findByTrainIdAndReservedFalse(trainId);

        if (!possibleSeats.isEmpty()) {
            Seat seat = possibleSeats.get(0);
            Reservation reservation = new Reservation();

            reservation.setUserID(userId);
            reservation.setSeat(seat);
            reservation.setStartStation(stationRepository.findById(startStationId).get());
            reservation.setEndStation(stationRepository.findById(endStationId).get());
            reservation.setReservationTime(LocalDateTime.now());

            seat.setReserved(true);
            seatRepository.save(seat);
            reservationRepository.save(reservation);

            return true;
        }
        return false;
    }

}
