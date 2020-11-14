package com.Lambda.Sorting;

import com.OOP.Encapsulation.Role;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee e1 = new Employee(101, "Nelson", "Canwyll", "PA", new Role(1, "Developer"));
        Employee e2 = new Employee(102, "Mike", "Smith", "VA", new Role(2, "Tester"));
        Employee e3 = new Employee(103, "Jane", "Austen", "IL", new Role(3, "Manager"));
        Employee e4 = new Employee(104, "Bovary", "Madam", "PA", new Role(4, "SDET"));
        Employee e5 = new Employee(105, "Benjamin", "Franklin", "GA", new Role(5, "Project Manager"));
        Employee e6 = new Employee(106, "Joseph", "The Saint", "CA", new Role(6, "Scrum Master"));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

        System.out.println(employeeList);

        employeeList.sort((emp1,emp2)-> emp1.getEmployeeId().compareTo(emp2.getEmployeeId()));
        System.out.println(employeeList);

        employeeList.sort((emp1,emp2) -> (emp1.getRole().getId().compareTo(emp2.getRole().getId())));
        System.out.println(employeeList);




    }
}
