package com.example.trainticketbooking.repository;

import com.example.trainticketbooking.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
