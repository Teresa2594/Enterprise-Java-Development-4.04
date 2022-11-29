package com.ironhack.lab404.Service.Impl;

import com.ironhack.lab404.Model.Employees;
import com.ironhack.lab404.Model.Patients;
import com.ironhack.lab404.Model.Status;
import com.ironhack.lab404.Repository.EmployeesRepository;
import com.ironhack.lab404.Service.Interfaces.IEmployeesService;
import com.ironhack.lab404.Service.Interfaces.IPatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeesService implements IEmployeesService {

    @Autowired
    EmployeesRepository employeesRepository;


    public void updateEmployeesDepartment(String department, Integer employeeId) {
        Optional<Employees> employeeOptional = employeesRepository.findById(employeeId);
        if (employeeOptional.isEmpty()) return;
        Employees employee = employeeOptional.get();
        employee.setDepartment(department);
        employeesRepository.save(employee);
    }

    public void updateEmployeesStatus(Status status, Integer employeeId) {
        Optional<Employees> employeeOptional = employeesRepository.findById(employeeId);
        if (employeeOptional.isEmpty()) return;
        Employees employee = employeeOptional.get();
        employee.setStatus(status);
        employeesRepository.save(employee);

    }
}

