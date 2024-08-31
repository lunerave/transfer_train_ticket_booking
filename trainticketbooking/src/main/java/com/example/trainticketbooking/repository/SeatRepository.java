package com.example.trainticketbooking.repository;

import com.example.trainticketbooking.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    List<Seat> findByTrainIdAndReservedFalse(Long trainId);
}
