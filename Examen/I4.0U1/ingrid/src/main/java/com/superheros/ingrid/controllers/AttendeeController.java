package com.superheros.ingrid.controllers;

import com.superheros.ingrid.entity.Attendee;
import com.superheros.ingrid.services.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendee")
public class AttendeeController {

    @Autowired
    private AttendeeService attendeeService;

    @GetMapping("/getAll")
    public List<Attendee> getAllAttendees() {
        return attendeeService.getAll();
    }

    @GetMapping("/getAttendeeByEmail/{email}")
    public Attendee getAttendeeByEmail(@PathVariable String email) {
        return attendeeService.getByEmail(email);
    }

    @PostMapping("/save")
    public Attendee saveAttendee(@RequestBody Attendee attendee) {
        return attendeeService.save(attendee);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteAttendee(@PathVariable Long id) {
        attendeeService.delete(id);
    }
}
