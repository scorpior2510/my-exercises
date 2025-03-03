package org.example;

import java.util.List;
import java.util.function.Function;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("aaa", 1000);
        Employee emp2 = new Employee("bbb", 2000);
        Employee emp3 = new Employee("ccc", 3000);
        Employee emp4 = new Employee("ddd", 4000);
        List<Employee> employees = List.of(emp1, emp2, emp3, emp4);

        Function<Employee, String> employeeToStringFunction = emp -> "Employee Name: " + emp.getName() + ", Salary: " + emp.getSalary();

        employees.stream().map(employeeToStringFunction).forEach(System.out::println);

    }
}