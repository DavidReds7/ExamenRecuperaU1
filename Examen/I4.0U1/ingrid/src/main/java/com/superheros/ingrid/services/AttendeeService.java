package com.superheros.ingrid.services;

import com.superheros.ingrid.entity.Attendee;
import com.superheros.ingrid.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AttendeeService {

    @Autowired
    private AttendeeRepository attendeeRepository;

    public Attendee save(Attendee attendee) {
        if (attendeeRepository.findByEmail(attendee.getEmail()) != null) {
            throw new IllegalArgumentException("Attendee ya esta registrado");
        }
        return attendeeRepository.save(attendee);
    }

    public List<Attendee> getAll() {
        return attendeeRepository.findAll();
    }

    public Attendee getByEmail(String email) {
        return attendeeRepository.findByEmail(email);
    }

    public void delete(Long id) {
        attendeeRepository.deleteById(id);
    }
}
