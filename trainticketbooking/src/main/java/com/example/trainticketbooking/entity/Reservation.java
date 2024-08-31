package com.example.trainticketbooking.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userID;

    @ManyToOne
    @JoinColumn(name="seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name="start_station_id")
    private Station startStation;

    @ManyToOne
    @JoinColumn(name="end_station_id")
    private Station endStation;

    private LocalDateTime reservationTime;
}
