package com.example.employee_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_backend.entity.Employee;
import com.example.employee_backend.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee save(Employee e) {
        return repo.save(e);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
