package com.ironhack.lab404.Repository;

import com.ironhack.lab404.Model.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<Patients,Integer> {
}
