package com.superheros.ingrid.services;

import com.superheros.ingrid.entity.Event;
import com.superheros.ingrid.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event save(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    public Event getById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        eventRepository.deleteById(id);
    }

    public Event update(Long id, Event eventDetails) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event != null) {
            event.setName(eventDetails.getName());
            event.setDescription(eventDetails.getDescription());
            event.setDate(eventDetails.getDate());
            event.setOrganizer_id(eventDetails.getOrganizer_id());
            return eventRepository.save(event);
        }
        return null;
    }
}