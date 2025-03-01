package com.superheros.ingrid.controllers;
import com.superheros.ingrid.entity.Organizer;
import com.superheros.ingrid.services.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/organizer")
public class OrganizerController {

    @Autowired
    private OrganizerService organizerService;

    @GetMapping("/getAll")
    public List<Organizer> getAllOrganizers() {
        return organizerService.getAll();
    }

    @GetMapping("/findByName/{name}")
    public Organizer getOrganizerByName(@PathVariable String name) {
        return organizerService.getByName(name);
    }

    @GetMapping("/getById/{id}")
    public Organizer getOrganizerById(@PathVariable Long id) {
        return organizerService.getById(id);
    }

    @PostMapping("/save")
    public Organizer saveOrganizer(@RequestBody Organizer organizer) {
        return organizerService.save(organizer);
    }
}
