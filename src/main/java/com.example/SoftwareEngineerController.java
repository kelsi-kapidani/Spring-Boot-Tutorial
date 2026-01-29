package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/se-list")
public class SoftwareEngineerController {
    

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
            new SoftwareEngineer(1, "Qamili", "js, node, react, tailwindcss"),
            new SoftwareEngineer(1, "Kismete", "js, node, react, tailwindcss")
        );
    }
}
