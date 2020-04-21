package com.java8.features;

/**
 * If you read forEach method details carefully, you will notice that it’s defined in Iterable interface but we know that
 * interfaces can’t have method body. From Java 8, interfaces are enhanced to have method with implementation. We can use
 * default and static keyword to create interfaces with method implementation.
 * 
 * We know that Java doesn’t provide multiple inheritance in Classes because it leads to Diamond Problem. So how it will be
 * handled with interfaces now, since interfaces are now similar to abstract classes. The solution is that compiler will
 * throw exception in this scenario and we will have to provide implementation logic in the class implementing the interfaces.
 *
 * Notice that both the interfaces have a common method log() with implementation logic.
 * 
 * As you can see that Interface1 has static method implementation that is used in MyClass.log() method implementation. 
 * Java 8 uses default and static methods heavily in Collection API and default methods are added so that our code 
 * remains backward compatible.
 * 
 * If any class in the hierarchy has a method with the same signature, then default methods become irrelevant. 
 * Since any class implementing an interface already has Object as a superclass, if we have equals(), hashCode() 
 * default methods in the interface, it will become irrelevant. That’s why for better clarity, interfaces are not allowed 
 * to have Object default methods.
 * 
 * Important points about java interface default methods
 * Java interface default methods will help us in extending interfaces without having the fear of breaking implementation classes.
 * Java interface default methods has bridge down the differences between interfaces and abstract classes.
 * Java 8 interface default methods will help us in avoiding utility classes, such as all the Collections class method can be provided in the interfaces itself.
 * Java interface default methods will help us in removing base implementation classes, we can provide default implementation and the implementation classes 
 * can chose which one to override.
 * One of the major reason for introducing default methods in interfaces is to enhance the Collections API in Java 8 to support lambda expressions
 * Java interface default methods are also referred to as Defender Methods or Virtual extension methods.
 *  
 */
public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	// MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.print("abc");
		Interface1.super.log("From 1");
		Interface2.super.log("From 2");
	}

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.log("From MyClass");
		
	}
}