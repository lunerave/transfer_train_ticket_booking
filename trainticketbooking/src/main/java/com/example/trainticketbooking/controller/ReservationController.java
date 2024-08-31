package com.example.trainticketbooking.controller;

import com.example.trainticketbooking.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/booking")
    public String index() {
        return "reservation";
    }

    @PostMapping("/reserve")
    public String reserve(@RequestParam String userId,
                          @RequestParam Long trainId,
                          @RequestParam Long startStationId,
                          @RequestParam Long endStationId, Model model) {
        boolean success = reservationService.reserve(userId, trainId, startStationId, endStationId);
        model.addAttribute("success", success);
        return "reservation";
    }


}
