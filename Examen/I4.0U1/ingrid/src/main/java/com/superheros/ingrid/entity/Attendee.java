package com.superheros.ingrid.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event_id;
}
