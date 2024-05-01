package com.abhivansh.employeemanagement.repository;

import org.springframework.stereotype.Repository;
import com.abhivansh.employeemanagement.entity.EmpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmpRepository extends JpaRepository<EmpEntity, Long>{
    
}
