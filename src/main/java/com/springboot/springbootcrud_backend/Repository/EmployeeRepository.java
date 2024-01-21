package com.springboot.springbootcrud_backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootcrud_backend.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    
} 