package com.ironhack.lab404.Controller.Interfaces;

import com.ironhack.lab404.Controller.DTO.EmployeesDepartmentDTO;
import com.ironhack.lab404.Controller.DTO.EmployeesStatusDTO;
import com.ironhack.lab404.Model.Employees;
import com.ironhack.lab404.Model.Patients;
import com.ironhack.lab404.Repository.EmployeesRepository;
import com.ironhack.lab404.Repository.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IEmployeesController {

    //  ******************************************************  GET  ******************************************************

    List<Employees> getAllEmployees();

    //  *****************************************************  POST  ******************************************************

    void saveEmployees(Employees employee);


    //  *****************************************************  PATCH  *****************************************************

    void updateEmployeesDepartment(EmployeesDepartmentDTO employeesDepartmentDTO, Integer employeeId);

    void updateEmployeesStatus (EmployeesStatusDTO employeesStatusDTO, Integer employeeId);


}
