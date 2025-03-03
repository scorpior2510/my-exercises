package org.example.approach7;

import org.example.base.Person;
import org.example.base.PersonFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.example.base.Utils.printIterable;

public class App7 {

    private static void processPersons(List<Person> roster,
                                       Predicate<Person> tester,
                                       Function<Person, String> mapper,
                                       Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static void main(String[] args) {

        List<Person> people = PersonFactory.createRandPeople(15);
        System.out.println("------All People");
        printIterable(people);
        System.out.println("\n------People Eligible For Selective Service (Males between 18 and 25)");
        processPersons(
                people,
                p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email));
    }
}
