package com.abhivansh.employeemanagement.service;

import java.util.List;

import com.abhivansh.employeemanagement.entity.EmpEntity;

public interface EmpService {
    EmpEntity saveEmployee(EmpEntity employee);

    List<EmpEntity> fetchAllEmployees();

    EmpEntity getEmployeeById(Long id);

    EmpEntity updateEmployeeById(Long id, EmpEntity employee);

    String deleteDepartmentById(Long id);
}
