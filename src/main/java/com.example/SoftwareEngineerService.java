package com.example;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {
    
    private final SoftwareEngineerRepository seRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository seRepository) {
        this.SoftwareEngineerRepository = seRepository;
    }

    public List<SoftwareEngineer> getSoftwareEngineers{
        return seRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        seRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEgnineerById(Integer id) {
        return softwareEngineerRepository.findByid(id). orElseThrow(() -> new IllegalStateException(id + " not found"));
    }
}
