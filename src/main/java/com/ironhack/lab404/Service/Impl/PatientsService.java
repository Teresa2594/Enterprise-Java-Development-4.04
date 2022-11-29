package com.ironhack.lab404.Service.Impl;

import com.ironhack.lab404.Model.Patients;
import com.ironhack.lab404.Repository.PatientsRepository;
import com.ironhack.lab404.Service.Interfaces.IPatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientsService implements IPatientsService {

    @Autowired
    PatientsRepository patientsRepository;

    public void updatePatients(Patients patient, Integer patientId) {
        Optional<Patients> patientOptional = patientsRepository.findById(patientId);
        if (patientOptional.isEmpty()) return;
        patient.setPatientId(patientId);
        patientsRepository.save(patient);
    }
}
