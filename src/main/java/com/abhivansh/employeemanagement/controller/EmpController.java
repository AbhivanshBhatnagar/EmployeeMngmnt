package com.abhivansh.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhivansh.employeemanagement.entity.EmpEntity;
import com.abhivansh.employeemanagement.service.EmpService;

@RestController
public class EmpController {
    @Autowired
    private EmpService employeeService;

    @PostMapping("/newemployee")
    public EmpEntity saveEmployee(@RequestBody EmpEntity employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/allemployees")
    public List<EmpEntity> getAllEmployees() {
        return employeeService.fetchAllEmployees();
    }

    @GetMapping("/getemployee/{id}")
    public EmpEntity getEmployeeById(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/editemployee/{id}")
    public EmpEntity updateEmployee(@PathVariable("id") Long id, @RequestBody EmpEntity employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    @DeleteMapping("/deleteemployee/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        return employeeService.deleteDepartmentById(id);
    }
}
