package org.example.ex3;

import org.example.ex2.Employee;
import org.example.ex2.EmployeeStatistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3Tester {
    public static void test() {
        System.out.println("Test: Ex3 --------------------");
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            people.add(new Person());
        }
        System.out.println("List of people:");
        people.forEach(System.out::println);
        people.sort(Person::compareByAge);
        System.out.println("List of people (Ascending Sort):");
        people.forEach(System.out::println);
        people.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
        System.out.println("List of people (Descending Sort):");
        people.forEach(System.out::println);
    }
}
