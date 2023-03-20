package com.example.demo.rest;

import com.example.demo.DAO.ContactDAOImpl;
import com.example.demo.entity.Contact;
import com.example.demo.entity.Employee;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    @Autowired
    private Service service;

    @Autowired
    private ContactDAOImpl contactService;

    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){
        return service.findAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId){
        return service.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        return service.save(theEmployee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        return service.save(theEmployee);
    }
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployeeById(@PathVariable int employeeId){
        Employee theEmployee = service.findById(employeeId);

        service.deleteById(employeeId);

        return "Delete employee id - " + employeeId;
    }
    @GetMapping("/contacts")
    public List<Contact> findAllContacts(){
        return service.findAllContacts();
    }
    @GetMapping("/employee/{id}/contact")
    public List<Contact> getContacts(@PathVariable int id) {
        Employee employee = getEmployeeById(id);
        return employee.getContacts();
    }

    @PostMapping("/contact")
    public Contact createContact(@RequestBody Contact contact) {

       contact.setContactId(0);
       return contactService.save(contact);

    }
}
