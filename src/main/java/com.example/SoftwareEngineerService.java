package com.example;

import java.util.List;

import org.springframework.stereotype.Service;
import java.lang.IllegalStateException;
import java.util.Optional;


@Service
public class SoftwareEngineerService {
    
    private final SoftwareEngineerRepository seRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository seRepository) {
        this.seRepository = seRepository;
    }

    public List<SoftwareEngineer> getSoftwareEngineers () {
        return seRepository.findAll();
    }

    public SoftwareEngineer insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        return seRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return seRepository.findById(id). orElseThrow(() -> new IllegalStateException(id + " not found"));
    }
}
