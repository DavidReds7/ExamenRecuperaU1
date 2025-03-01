package com.superheros.ingrid.repository;

import com.superheros.ingrid.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    Event findById(long id);
    List<Event> findByName(String name);
}