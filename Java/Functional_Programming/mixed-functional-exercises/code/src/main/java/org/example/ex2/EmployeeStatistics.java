package org.example.ex2;

import java.util.List;
import java.util.Optional;

public class EmployeeStatistics {
    public static List<String> employeesEarningMoreThan(List<Employee> list, double salary) {
        return list.stream().filter(emp -> emp.getSalary() > salary).map(Employee::getName).toList();
    }
}
