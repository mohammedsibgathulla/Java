package com.java.programs.custom;

public class EmployeeUsingComparable implements Comparable<EmployeeUsingComparable> {

	private int id = -1;
	private String firstName = null;
	private String lastName = null;
	private int age = -1;

	public EmployeeUsingComparable(int id, String fName, String lName, int age) {
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;
		this.age = age;
	}

	@Override
	public int compareTo(EmployeeUsingComparable o) {
		// return this.id - o.id;
		// return this.age - o.age;
		// return this.firstName.toLowerCase().compareTo(o.firstName.toLowerCase());
		return this.lastName.toLowerCase().compareTo(o.lastName.toLowerCase());
	}

	@Override
	public String toString() {
		return "Employee : " + id + " - " + firstName + " - " + lastName + " - " + age + "\n";
	}
}