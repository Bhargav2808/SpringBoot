package com.example.demo.DAO;

import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
