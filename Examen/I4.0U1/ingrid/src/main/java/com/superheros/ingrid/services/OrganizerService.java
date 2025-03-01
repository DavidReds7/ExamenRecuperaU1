package com.superheros.ingrid.services;

import com.superheros.ingrid.entity.Organizer;
import com.superheros.ingrid.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    public Organizer save(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public List<Organizer> getAll() {
        return organizerRepository.findAll();
    }

    public Organizer getByName(String name) {
        return organizerRepository.findByName(name);
    }

    public Organizer getById(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }
}
