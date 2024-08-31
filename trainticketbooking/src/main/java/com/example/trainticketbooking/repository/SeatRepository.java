package com.example.trainticketbooking.repository;

import com.example.trainticketbooking.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
