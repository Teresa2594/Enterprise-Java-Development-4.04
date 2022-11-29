package com.ironhack.lab404.Service.Interfaces;

import com.ironhack.lab404.Model.Status;

public interface IEmployeesService {

    void updateEmployeesDepartment(String department, Integer employeeId);

    void updateEmployeesStatus(Status status, Integer employeeId);
}
