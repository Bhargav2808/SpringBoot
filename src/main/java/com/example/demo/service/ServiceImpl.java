package com.example.demo.service;

import com.example.demo.DAO.ContactDAO;
import com.example.demo.DAO.EmployeeDAO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ServiceImpl implements Service {

    @Autowired
    @Qualifier("employeeDAO")
    private EmployeeDAO employeeDAO;
    @Autowired
    @Qualifier("contactDAO")
    private ContactDAO contactDAO;
    @Override
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAll();
    }
    @Override
    public List<Contact> findAllContacts() {
        return contactDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);
    }
}
