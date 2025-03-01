package com.superheros.ingrid.repository;

import com.superheros.ingrid.entity.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
    Attendee findByEmail(String email);
}