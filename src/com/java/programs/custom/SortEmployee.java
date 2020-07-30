package com.java.programs.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee{
	public static void main(String[] args) {
	       EmployeeUsingComparable e1 = new EmployeeUsingComparable(1, "aTestName", "dLastName", 34);
	        EmployeeUsingComparable e2 = new EmployeeUsingComparable(2, "nTestName", "pLastName", 30);
	        EmployeeUsingComparable e3 = new EmployeeUsingComparable(3, "kTestName", "sLastName", 31);
	        EmployeeUsingComparable e4 = new EmployeeUsingComparable(4, "dTestName", "zLastName", 25);
	 
	        List<EmployeeUsingComparable> employees = new ArrayList<EmployeeUsingComparable>();
	        employees.add(e2);
	        employees.add(e3);
	        employees.add(e1);
	        employees.add(e4);
	 
	        // UnSorted List
	        System.out.println(employees);
	 
	        Collections.sort(employees);
	 
	        // Default Sorting by employee id
	        System.out.println(employees);
	}
}
