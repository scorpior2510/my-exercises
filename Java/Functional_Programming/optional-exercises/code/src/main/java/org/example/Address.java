package org.example;

import java.util.Optional;

public class Address {

    private Optional<String> zipcode;

    public Address(Optional<String> zipcode) {
        this.zipcode = zipcode;
    }

    public Optional<String> getZipcode() {
        return this.zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipcode=" + zipcode +
                '}';
    }
}
