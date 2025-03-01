package com.superheros.ingrid.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String date;

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    private Organizer organizer_id;


}