package com.java8.features;

/**
 * Java interface static method is similar to default method except that we can’t override them in the implementation 
 * classes. This feature helps us in avoiding undesired results in case of poor implementation in implementation classes.
 *
 * Note that isNull(String str) is a simple class method, it’s not overriding the interface method. For example, 
 * if we will add @Override annotation to the isNull() method, it will result in compiler error.
 * 
 * Java interface static method is visible to interface methods only, if we remove the isNull() method from the 
 * MyDataImpl class, we won’t be able to use it for the MyDataImpl object. However like other static methods, we can use 
 * interface static methods using class name. 
 * 
 * Important points about java interface static method:
 * Java interface static method is part of interface, we can’t use it for implementation class objects.
 * Java interface static methods are good for providing utility methods, for example null check, collection sorting etc.
 * Java interface static method helps us in providing security by not allowing implementation classes to override them.
 * We can’t define interface static method for Object class methods, we will get compiler error as “This static method 
 * cannot hide the instance method from Object”. This is because it’s not allowed in java, since Object is the base class 
 * for all the classes and we can’t have one class level static method and another instance method with same signature.
 * We can use java interface static methods to remove utility classes such as Collections and move all of it’s 
 * static methods to the corresponding interface, that would be easy to find and use.
 */
public class MyDataImpl implements MyData {
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
	}
}