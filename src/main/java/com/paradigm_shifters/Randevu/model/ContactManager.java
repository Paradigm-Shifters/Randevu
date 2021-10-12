package com.paradigm_shifters.Randevu.model;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {

    Map<String, Contact> contactList = new ConcurrentHashMap<>();

    public void addContact(String firstName, String lastName, String phoneNumber) {
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        validateContact(contact);
        contactList.put(generateKey(contact), contact);
    }

    public Collection<Contact> getAllContacts() {
        return contactList.values();
    }

    private void validateContact(Contact contact) {
        contact.validatePhoneNumber();
        contact.validateFirstName();
        contact.validateLastName();
    }

    private String generateKey(Contact contact) {
        return String.format("%s-%s", contact.getFirstName(), contact.getLastName());
    }
}