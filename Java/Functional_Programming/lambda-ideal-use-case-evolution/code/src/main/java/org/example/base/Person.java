package org.example.base;

import java.time.LocalDate;

public class Person {

    public enum Sex {MALE, FEMALE}

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthday.getYear();
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s (Age: %d), %s", this.name, this.gender, this.birthday, this.getAge(), this.emailAddress);
    }

    public void printPerson() {
        System.out.println(this);
    }
}
