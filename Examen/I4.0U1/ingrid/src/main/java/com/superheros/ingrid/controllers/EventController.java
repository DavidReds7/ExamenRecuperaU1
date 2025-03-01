package com.superheros.ingrid.controllers;

import com.superheros.ingrid.entity.Event;
import com.superheros.ingrid.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/getAll")
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventService.getById(id);
    }

    @PutMapping("/update/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event event) {
        return eventService.update(id, event);
    }

    @PostMapping("/save")
    public Event saveEvent(@RequestBody Event event) {
        return eventService.save(event);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventService.delete(id);
    }
}
