package com.ironhack.lab404.Controller.Impl;

import com.ironhack.lab404.Controller.Interfaces.IPatientsController;
import com.ironhack.lab404.Model.Patients;
import com.ironhack.lab404.Repository.PatientsRepository;
import com.ironhack.lab404.Service.Impl.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PatientsController implements IPatientsController {

    @Autowired
    PatientsRepository patientsRepository;

    @Autowired
    PatientsService patientsService;


    //  ******************************************************  GET  ******************************************************

    @GetMapping("/Patients")
    @ResponseStatus(HttpStatus.OK)
    public List<Patients> getAllPatients() {
        return patientsRepository.findAll();
    }

    //  *****************************************************  POST  ******************************************************

    @PostMapping("/patients")
    @ResponseStatus(HttpStatus.CREATED)

    public void savePatient(@RequestBody Patients patient) {
        patientsRepository.save(patient);
    }


    //  ******************************************************  PUT  ******************************************************

    @PutMapping("/patients/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePatients(@RequestBody Patients patient, @PathVariable Integer patientId) {
        patientsService.updatePatients(patient,patientId);

    }

}
