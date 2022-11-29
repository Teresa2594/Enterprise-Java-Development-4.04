package com.ironhack.lab404.Controller.Impl;

import com.ironhack.lab404.Controller.DTO.EmployeesDepartmentDTO;
import com.ironhack.lab404.Controller.DTO.EmployeesStatusDTO;
import com.ironhack.lab404.Controller.Interfaces.IEmployeesController;
import com.ironhack.lab404.Model.Employees;
import com.ironhack.lab404.Repository.EmployeesRepository;
import com.ironhack.lab404.Service.Impl.EmployeesService;
import com.ironhack.lab404.Service.Interfaces.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeesController implements IEmployeesController {

    @Autowired
    EmployeesRepository employeesRepository;

    @Autowired
    IEmployeesService employeesService;

    //  ******************************************************  GET  ******************************************************

    @GetMapping("/Employees")
    @ResponseStatus(HttpStatus.OK)
    public List<Employees> getAllEmployees() {
        return employeesRepository.findAll();
    }

    //  *****************************************************  POST  ******************************************************

    @PostMapping("/Employees")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveEmployees(@RequestBody Employees employee) {
        employeesRepository.save(employee);
    }

    //  *****************************************************  PATCH  *****************************************************

    @PatchMapping("/Employees/department/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployeesDepartment(@RequestBody EmployeesDepartmentDTO employeesDepartmentDTO, @PathVariable Integer employeeId) {
        employeesService.updateEmployeesDepartment(employeesDepartmentDTO.getDepartment(), employeeId);
    }

    @PatchMapping("/Employees/status/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployeesStatus(@RequestBody EmployeesStatusDTO employeesStatusDTO, @PathVariable Integer employeeId) {
        employeesService.updateEmployeesStatus(employeesStatusDTO.getStatus(), employeeId);
    }
}
