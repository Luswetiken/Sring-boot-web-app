package com.springpro.springpro.controller;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class patientcontroller {
    @Autowired
    private Patientservice patientservice;
    @PostMapping("/addPatient")
    public Patient postDetails(@RequestBody Patient patient)
    {
         return PatientService.saveDetails();

}
}
