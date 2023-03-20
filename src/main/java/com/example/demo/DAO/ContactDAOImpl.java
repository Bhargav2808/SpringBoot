package com.example.demo.DAO;

import com.example.demo.entity.Contact;
import com.example.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Qualifier("contactDAO")

public class ContactDAOImpl implements ContactDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Contact> findAll() {
        TypedQuery<Contact> theQuery = entityManager.createQuery("from Contact", Contact.class);
        List<Contact> contacts = theQuery.getResultList();
        return contacts;
    }

    @Override
    @Transactional
    public Contact save(Contact contact) {
        Contact c = entityManager.merge(contact);
        return c;
    }
}
