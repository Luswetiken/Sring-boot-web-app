package com.springpro.springpro.service;

import org.springframework.beans.factory.annotation.Autowired;

@service
public class patientservice {
    @Autowired
    private PatientRepo patientRepo;
    public Patient saveDetails(Patient patient){
        return patientRepo.save(patient);
    }


}
