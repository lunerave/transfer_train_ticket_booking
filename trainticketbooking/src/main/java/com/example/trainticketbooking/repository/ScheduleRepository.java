package com.example.trainticketbooking.repository;

import com.example.trainticketbooking.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
