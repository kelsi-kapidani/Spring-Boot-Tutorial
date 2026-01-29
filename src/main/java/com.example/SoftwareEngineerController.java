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
        this.SoftwareEngineerService = seService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
            new SoftwareEngineer(1, "Qamili", "js, node, react, tailwindcss"),
            new SoftwareEngineer(1, "Kismete", "js, node, react, tailwindcss")
        );
    }

    @GetMapping
    public List<SoftwareEngineer> getAllEngineers() {
        return softwareEngineerService.getSoftwareEngineers();
    }

    @GetMapping({"id"})
    public List<SoftwareEngineer> getEngineerById(@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerById();
    }

    @PostMapping
    public SoftwareEgnineer addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
