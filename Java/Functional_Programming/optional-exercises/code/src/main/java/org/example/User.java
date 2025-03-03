package org.example;

import java.util.Optional;

public class User {

    private Optional<Address> address;

    public User() {
    }

    public User(Optional<Address> address) {
        this.address = address;
    }

    public Optional<String> getZipcode() {
        return this.address.flatMap(Address::getZipcode);
    }

    @Override
    public String toString() {
        return "User{" +
                "address=" + address +
                '}';
    }
}
