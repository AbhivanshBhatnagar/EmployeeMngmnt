package com.abhivansh.employeemanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empId;
    private String empName;
    private String empSalary;

    public EmpEntity() {
    }

    public EmpEntity(long empId, String empName, String empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "EmpEntity [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", getEmpId()="
                + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpSalary()=" + getEmpSalary() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
