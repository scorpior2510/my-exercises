package org.example.approach5;

import org.example.base.Person;
import org.example.base.PersonFactory;

import java.util.List;

import static org.example.base.Utils.printIterable;

public class App5 {

    private static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p))
                p.printPerson();
        }
    }

    public static void main(String[] args) {

        List<Person> people = PersonFactory.createRandPeople(15);
        System.out.println("------All People");
        printIterable(people);
        System.out.println("\n------People Eligible For Selective Service (Males between 18 and 25)");
        printPersons(people, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }
}
