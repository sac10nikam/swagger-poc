package com.company.web.impl;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import model.Response;

import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;

import com.company.web.ContactController;

@RestController
public class ContactControllerImpl implements ContactController {

    /**
     * Purpose: Fetches Contacts details.
     * 
     * @param <T>
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
    public Response getContacts(@PathVariable String employeeId, @PathVariable String companyId) {
        final List<Contact> contactList = new ArrayList<Contact>();
        final Response response = new Response();
        final Contact contact = new Contact();
        contact.setAddress1("32, Conroy Rd");
        contact.setAddress2("Orlando Florida, 32811");
        contactList.add(contact);
        response.setData(contactList);
        if (StringUtils.endsWithIgnoreCase("502", employeeId)) {
            throw new RestClientException(HttpStatus.BAD_GATEWAY.getReasonPhrase());
        } else if (StringUtils.endsWithIgnoreCase("500", employeeId)) {
            throw new RestClientException(HttpStatus.SERVICE_UNAVAILABLE.getReasonPhrase());
        } else if (StringUtils.endsWithIgnoreCase("400", employeeId)) {
            throw new RestClientException(HttpStatus.NOT_FOUND.getReasonPhrase());
        }
        return response;
    }
}