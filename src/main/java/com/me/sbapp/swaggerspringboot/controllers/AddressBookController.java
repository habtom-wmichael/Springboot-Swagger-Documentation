package com.me.sbapp.swaggerspringboot.controllers;

import com.me.sbapp.swaggerspringboot.models.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
@RestController
@RequestMapping("/api")
public class AddressBookController {

    ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<>();


    @GetMapping(value = "/{id}" ,produces = "application/json")
    public Contact getContact(@PathVariable String id) {
        System.out.println("hi");

        return contacts.get(id);
    }

    @GetMapping(value = "/",produces = "application/json")
    public List<Contact> getListContact() {
        return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping(value = "/", consumes = "application/json")
    public Contact addContact(@RequestBody Contact contact) {
      return   contacts.put(contact.getId(), contact);
    }
}
