package com.java.overriding;

public class ClassImpl {
	public static void main(String[] args) {
		Parent parent = new Child();

		//System.out.println(parent.x); // Output -- Parent`s Instance Variable
		parent.print();
	}
}
