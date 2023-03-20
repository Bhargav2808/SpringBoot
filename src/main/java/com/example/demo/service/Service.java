package com.example.demo.service;

import com.example.demo.entity.Contact;
import com.example.demo.entity.Employee;

import java.util.List;

public interface Service {
    List<Employee> findAllEmployees();
    List<Contact> findAllContacts();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
