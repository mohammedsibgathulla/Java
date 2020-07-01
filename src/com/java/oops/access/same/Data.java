package com.java.oops.access.same;

public class Data {
	//Varaibles
	private int privateVar;
	int defaultVar;
	protected int protectedVar;
	public int publicVar;
		
	//Inner Classes
	private class PrivateInnerClass{}
	class DefaultInnerClass{}
	protected class ProtectedInnerClass{
		//You have to create public constructor in the protected inner class in order to access it in OtherPackageSubClass or else it is not accessible.
		public ProtectedInnerClass() { 
			// TODO Auto-generated constructor stub
		}}
	public class PublicInnerClass{}
	
	private void privateMethod() {
		int w = privateVar;
		int x = defaultVar;
		int y = protectedVar;
		int z = publicVar;
	}
	
	void defaultMethod() {
		int w = privateVar;
		int x = defaultVar;
		int y = protectedVar;
		int z = publicVar;
	}
	
	protected void protectedMethod() {
		int w = privateVar;
		int x = defaultVar;
		int y = protectedVar;
		int z = publicVar;
	}
	
	public void publicMethod() {
		int w = privateVar;
		int x = defaultVar;
		int y = protectedVar;
		int z = publicVar;
	}
	
	public static void main(String ar[]) {
		Data d = new Data();
		
		//Accessing Inner Classes
		PrivateInnerClass privateInnerClass = d.new PrivateInnerClass();
		DefaultInnerClass defaultInnerClass = d.new DefaultInnerClass();
		ProtectedInnerClass protectedInnerClass = d.new ProtectedInnerClass();
		PublicInnerClass publicInnerClass = d.new PublicInnerClass();
		
		//Accessing Variables 
		d.privateVar = 10;
		d.defaultVar = 20;
		d.protectedVar = 30;
		d.publicVar = 40;
		
		//Accessing Methods
		d.privateMethod();
		d.defaultMethod();
		d.protectedMethod();
		d.publicMethod();
		
	}

}
