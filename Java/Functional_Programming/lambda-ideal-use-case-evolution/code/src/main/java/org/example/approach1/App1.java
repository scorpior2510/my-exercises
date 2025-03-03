package org.example.approach1;

import org.example.base.Person;
import org.example.base.PersonFactory;

import java.util.List;

import static org.example.base.Utils.printIterable;

public class App1 {

    private static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age)
                p.printPerson();
        }
    }

    public static void main(String[] args) {
        List<Person> people = PersonFactory.createRandPeople(12);
        System.out.println("------All People");
        printIterable(people);
        System.out.println("\n------People Older Than 30");
        printPersonsOlderThan(people, 30);
    }
}
