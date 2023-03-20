package com.example.demo.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Table(name="contact")

public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contact_id")
    private int contactId;

    @Column(name="employee_id")
    private int employeeId;

    @Column(name="contact_no")
    private String contactNo;

    public Contact() {

    }

    public Contact(int employeeId, String contactNo) {
        this.employeeId = employeeId;
        this.contactNo = contactNo;
    }
    public Contact(String contactNo) {
        this.contactNo = contactNo;
    }
    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
