package com.example.trainticketbooking.repository;

import com.example.trainticketbooking.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}
