package com.example.trainticketbooking.repository;

import com.example.trainticketbooking.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
