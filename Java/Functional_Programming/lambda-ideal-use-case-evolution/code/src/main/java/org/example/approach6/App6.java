package org.example.approach6;

import org.example.approach5.CheckPerson;
import org.example.base.Person;
import org.example.base.PersonFactory;

import java.util.List;
import java.util.function.Predicate;

import static org.example.base.Utils.printIterable;

public class App6 {

    private static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
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
        printPersonsWithPredicate(people, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }
}
