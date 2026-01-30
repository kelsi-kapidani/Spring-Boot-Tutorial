package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/se-list")
public class SoftwareEngineerController {
    
    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService seService) {
        this.softwareEngineerService = seService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
            new SoftwareEngineer( "Qamili", "js, node, react, tailwindcss"),
            new SoftwareEngineer( "Kismete", "js, node, react, tailwindcss")
        );
    }

    @GetMapping("/all")
    public List<SoftwareEngineer> getAllEngineers() {
        return softwareEngineerService.getSoftwareEngineers();
    }

    @GetMapping("/{id}")
    public SoftwareEngineer getEngineerById(@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping
    public SoftwareEngineer addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        return softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
