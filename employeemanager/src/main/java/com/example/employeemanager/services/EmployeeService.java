package com.example.employeemanager.services;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanager.model.Employee;
import com.example.employeemanager.repository.Employeerespository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {
    private final Employeerespository employeeRepo;

    @Autowired
    public EmployeeService(Employeerespository  employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

   
    public Employee addEmployee(Employee employee) {
       
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElse(null);
    }

    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
}