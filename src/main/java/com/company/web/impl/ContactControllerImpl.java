package com.company.web.impl;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import model.Response;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.company.web.ContactController;

@RestController
public class ContactControllerImpl implements ContactController {

    /**
     * Purpose: Fetches Contacts details.
     * 
     * 
     * @param employeeId
     * @param companyId
     * @return Response
     * 
     * @throws Exception
     * @see success data
     * 
     */
    public Response<List<Contact>> getContacts(@PathVariable String employeeId, @PathVariable String companyId) {
        final List<Contact> contactList = new ArrayList<Contact>();
        final Contact contact = new Contact();
        contact.setAddress1("32, Conroy Rd");
        contact.setAddress2("Orlando Florida, 32811");
        contactList.add(contact);
        return (Response<List<Contact>>) contactList;
    }
}