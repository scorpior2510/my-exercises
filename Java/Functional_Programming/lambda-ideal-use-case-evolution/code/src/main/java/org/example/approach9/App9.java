package org.example.approach9;

import org.example.base.Person;
import org.example.base.PersonFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.example.base.Utils.printIterable;

public class App9 {

    public static void main(String[] args) {

        List<Person> people = PersonFactory.createRandPeople(15);
        System.out.println("------All People");
        printIterable(people);
        System.out.println("\n------People Eligible For Selective Service (Males between 18 and 25)");
        people
                .stream()
                .filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25)
                .map(p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }
}
