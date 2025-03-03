package org.example.approach2;

import org.example.base.Person;
import org.example.base.PersonFactory;

import java.util.List;

import static org.example.base.Utils.printIterable;

public class App2 {

    private static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (p.getAge() >= low && p.getAge() <= high)
                p.printPerson();
        }
    }

    public static void main(String[] args) {
        List<Person> people = PersonFactory.createRandPeople(12);
        System.out.println("------All People");
        printIterable(people);
        System.out.println("\n------People between ages 20 and 30");
        printPersonsWithinAgeRange(people, 20, 30);
    }
}
