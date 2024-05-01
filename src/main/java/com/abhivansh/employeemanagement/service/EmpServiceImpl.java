package com.abhivansh.employeemanagement.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhivansh.employeemanagement.entity.EmpEntity;
import com.abhivansh.employeemanagement.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpRepository employeeRepository;

    @Override
    public EmpEntity saveEmployee(EmpEntity employee) {
        // TODO Auto-generated method stub
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmpEntity> fetchAllEmployees() {
        // TODO Auto-generated method stub
        List<EmpEntity> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

    @Override
    public EmpEntity getEmployeeById(Long id) {
        // TODO Auto-generated method stub
        Optional<EmpEntity> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return employee.get();
        }
        return null;
    }

    @Override
    public EmpEntity updateEmployeeById(Long id, EmpEntity employee) {
        // TODO Auto-generated method stub
        Optional<EmpEntity> employee1 = employeeRepository.findById(id);

        if (employee1.isPresent()) {
            EmpEntity originalEmployee = employee1.get();

            if (Objects.nonNull(employee.getEmpName()) && !"".equalsIgnoreCase(employee.getEmpName())) {
                originalEmployee.setEmpName(employee.getEmpName());
            }
            if (Objects.nonNull(employee.getEmpSalary()) && Integer.parseInt(employee.getEmpSalary()) != 0) {
                originalEmployee.setEmpSalary(employee.getEmpSalary());
            }
            return employeeRepository.save(originalEmployee);
        }
        return null;
    }

    @Override
    public String deleteDepartmentById(Long id) {
        // TODO Auto-generated method stub
        if (employeeRepository.findById(id).isPresent()) {
            employeeRepository.deleteById(id);
            return "Employee deleted successfully";
        }
        return "No such employee in the database";
    }
}
