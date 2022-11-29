package com.ironhack.lab404.Controller.Interfaces;

import com.ironhack.lab404.Model.Patients;

import java.util.List;

public interface IPatientsController {

    //  ******************************************************  GET  ******************************************************

    List<Patients> getAllPatients();

    //  *****************************************************  POST  ******************************************************

    void savePatient(Patients patient);

    //  ******************************************************  PUT  ******************************************************

    void updatePatients(Patients patient, Integer patientId);
}
