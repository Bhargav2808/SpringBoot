package com.example.demo.DAO;

import com.example.demo.entity.Contact;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


public interface ContactDAO {
    List<Contact> findAll();
    Contact save(Contact contact);
}
