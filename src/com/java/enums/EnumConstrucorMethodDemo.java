package com.java.enums;
// Java program to demonstrate that enums can have constructor 
// and concrete methods. 

// An enum (Note enum keyword inplace of class keyword) 
//enum can contain both concrete methods and abstract methods. If an enum class has an abstract method, then each instance of the enum class must implement it
enum Colr 
{ 
	//public static final Color RED = new Color();
	RED {
		@Override
		public int colorCode() {
			// TODO Auto-generated method stub
			return 123;
		}
	}, GREEN {
		@Override
		public int colorCode() {
			// TODO Auto-generated method stub
			return 1234;
		}
	}, BLUE {
		@Override
		public int colorCode() {
			// TODO Auto-generated method stub
			return 12345;
		}
	}; 

	// enum constructor called separately for each 
	// constant 
	private Colr() 
	{ 
		System.out.println("Constructor called for : " + 
		this.toString()); 
	} 

	public void colorInfo() 
	{ 
		System.out.println("Universal Color"); 
	} 
	
	public abstract int colorCode();
} 

public class EnumConstrucorMethodDemo 
{	 
	// Driver method 
	public static void main(String[] args) 
	{ 
		Colr c1 = Colr.RED; 
		System.out.println(c1); 
		c1.colorInfo(); 
		System.out.println(c1.colorCode());
	} 
} 
