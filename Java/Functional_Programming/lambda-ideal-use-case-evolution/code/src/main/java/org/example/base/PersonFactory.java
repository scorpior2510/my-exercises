package org.example.base;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class PersonFactory {

    private final static String[] names = {"James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
            "Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles", "Karen",
            "Christopher", "Nancy", "Daniel", "Margaret", "Matthew"};

    private static LocalDate generateRandomDate() {
        LocalDate now = LocalDate.now();
        LocalDate startDate = now.minusYears(60); // 60 years ago
        LocalDate endDate = now.minusYears(10);  // 10 years ago

        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();

        // Generate a random day between startEpochDay and endEpochDay
        long randomDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay + 1);

        return LocalDate.ofEpochDay(randomDay);
    }

    private static Person initializeRandPerson() {
        String randName = names[(int) (Math.random() * names.length)];
        String emailAddress = randName + "@gmail.com";
        Person.Sex randGender = new Random().nextBoolean() ? Person.Sex.FEMALE : Person.Sex.MALE;
        LocalDate birthday = generateRandomDate();
        return new Person(randName, birthday, randGender, emailAddress);
    }

    public static List<Person> createRandPeople(int num) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < num; i++)
            people.add(initializeRandPerson());
        return people;
    }
}
