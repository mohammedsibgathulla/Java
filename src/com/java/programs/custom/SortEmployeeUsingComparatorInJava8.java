package com.java.programs.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeUsingComparatorInJava8 {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "aTestName", "dLastName", 34);
		Employee e2 = new Employee(2, "nTestName", "pLastName", 30);
		Employee e3 = new Employee(3, "kTestName", "sLastName", 31);
		Employee e4 = new Employee(4, "dTestName", "zLastName", 25);
		Employee e5 = new Employee(5, "lokesh", "gupta", 32);
		Employee e6 = new Employee(6, "lokesh", "ramachandran", 60);
		Employee e7 = new Employee(6, "lokesh", "aamachandran", 20);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e2);
		employees.add(e3);
		employees.add(e1);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);

		// Sort all employees by first name
		employees.sort(Comparator.comparing(e -> e.getFirstName()));
		System.out.println("Sorted Employee Using First Name \n" + employees);

		// OR you can use below
		employees.sort(Comparator.comparing(Employee::getFirstName));
		System.out.println("Sorted Employee Using First Name \n" + employees);

		// Sort all employees by first name in reverse order
		Comparator<Employee> comparator = Comparator.comparing(Employee::getFirstName);
		employees.sort(comparator.reversed());
		System.out.println("Sorted Employee Using First Name Reverse Order: \n" + employees);

		// Sorting on multiple fields; Group by.
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
				.thenComparing(Employee::getLastName);
		employees.sort(groupByComparator);
		System.out.println("Sorted Employee Using First Name GroupBy Last Name\n" + employees);

		// Parallel Sorting
		Employee[] employeesArray = employees.toArray(new Employee[employees.size()]);
		Arrays.parallelSort(employeesArray, groupByComparator);
		System.out.println("Sorted Employee Using First Name Parallel: \n" + employeesArray);
		
		
		//first name comparator
		Comparator<Employee> compareByFirstName = Comparator.comparing( Employee::getFirstName );
		 
		//last name comparator
		Comparator<Employee> compareByLastName = Comparator.comparing( Employee::getLastName );
		 
		//Compare by first name and then last name (multiple fields)
		Comparator<Employee> compareByFullName = compareByFirstName.thenComparing(compareByLastName);
		 
		//Using Comparator & Streams
		System.out.println("Sorted Employee Using Streams By First Name: \n" + employees.stream().sorted( compareByFirstName ).collect(Collectors.toList()));		
		System.out.println("Sorted Employee Using Streams By Last Name: \n" + employees.stream().sorted( compareByLastName ).collect(Collectors.toList()));
		System.out.println("Sorted Employee Using Streams By Full Name: \n" + employees.stream().sorted( compareByFullName ).collect(Collectors.toList()));

	}
}
