package com.ironhack.lab404.Model;

import javax.persistence.*;

@Entity
public class Employees {
    @Id
    private Integer employeeId;

    private String department;

    private String name;

    @Enumerated(value= EnumType.STRING)
    @Column(name = "status",nullable = false, columnDefinition = "ENUM('ONCALL','ON','OFF'")
    private Status status;

    public Employees() {
    }

    public Employees(Integer employeeId, String department, String name, Status status) {
        this.employeeId = employeeId;
        this.department = department;
        this.name = name;
        this.status = status;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
