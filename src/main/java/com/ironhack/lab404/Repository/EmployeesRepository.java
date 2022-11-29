package com.ironhack.lab404.Repository;

import com.ironhack.lab404.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees,Integer> {
}
