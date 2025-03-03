package org.example.approach8;

import org.example.base.Person;
import org.example.base.PersonFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.example.base.Utils.printIterable;

public class App8 {

    private static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X element : source) {
            if (tester.test(element)) {
                Y data = mapper.apply(element);
                block.accept(data);
            }
        }
    }

    public static void main(String[] args) {

        List<Person> people = PersonFactory.createRandPeople(15);
        System.out.println("------All People");
        printIterable(people);
        System.out.println("\n------People Eligible For Selective Service (Males between 18 and 25)");
        processElements(
                people,
                p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
                p -> p.getEmailAddress(),
                email -> System.out.println(email)
        );
    }
}
