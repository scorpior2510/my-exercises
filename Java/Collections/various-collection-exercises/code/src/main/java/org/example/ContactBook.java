package org.example;

import java.util.*;

public class ContactBook {

    private final Map<String, Set<String>> contacts = new HashMap<>();

    public Map<String, Set<String>> getContacts() {
        return this.contacts;
    }

    public void addContact(String name, String phoneNumber) {
        Set<String> contactPhoneNumbers = this.contacts.get(name);
        if (contactPhoneNumbers == null)
            contactPhoneNumbers = new HashSet<>();
        contactPhoneNumbers.add(phoneNumber);
        this.contacts.put(name, contactPhoneNumbers);
    }

    public Set<String> findByName(String name) {
        return this.contacts.getOrDefault(name, new HashSet<>());
    }

    public Map<String, Set<String>> getContactsOrdered() {
        return new TreeMap<>(this.contacts);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Set<String>> entry : this.contacts.entrySet()) {
            stringBuilder.append("\n").append(entry.getKey()).append(", Phone Numbers: ");
            for (String phone : entry.getValue()) {
                stringBuilder.append(phone).append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
