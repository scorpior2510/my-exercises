package org.example.ex2;

import org.example.ex1.WordTransformer;

import java.util.ArrayList;
import java.util.List;

public class Ex2Tester {
    public static void test() {
        System.out.println("Test: Ex2 --------------------");
        List<Employee> list = List.of(
                new Employee("john", 1000),
                new Employee("barbi", 2000),
                new Employee("jack", 3000),
                new Employee("dani", 4000));
        System.out.println("The List of employees:");
        list.forEach(System.out::println);
        System.out.println("The List of employees with salary bigger than 5000:");
        EmployeeStatistics.employeesEarningMoreThan(list, 5000).forEach(System.out::println);
        System.out.println("The List of employees with salary bigger than 2500:");
        EmployeeStatistics.employeesEarningMoreThan(list, 2500).forEach(System.out::println);
    }
}
