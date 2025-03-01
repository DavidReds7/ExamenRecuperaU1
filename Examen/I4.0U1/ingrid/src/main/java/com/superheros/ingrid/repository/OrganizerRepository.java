package com.superheros.ingrid.repository;

import com.superheros.ingrid.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    Organizer findByName(String name);
}
