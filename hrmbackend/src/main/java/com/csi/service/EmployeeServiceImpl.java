package com.csi.service;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepository repository;


    public Employee save(Employee employee)
    {
        return repository.save(employee);
    }

    public List<Employee> findAll()
    {
        return repository.findAll();
    }



}
