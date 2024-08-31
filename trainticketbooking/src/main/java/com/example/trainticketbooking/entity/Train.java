package com.example.trainticketbooking.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="train_name")
    private String name;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
    private List<Schedule> schedules;

}
