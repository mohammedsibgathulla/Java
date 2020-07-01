package com.java.oops.access.same;

import com.java.oops.access.same.Data.DefaultInnerClass; 
import com.java.oops.access.same.Data.ProtectedInnerClass;
import com.java.oops.access.same.Data.PublicInnerClass;

public class SamePackageClass {
	public static void main(String ar[]) {
		Data d = new Data();
				
		//PrivateInnerClass privateInnerClass = d.new PrivateInnerClass(); //Can't Access Private Inner Class
		DefaultInnerClass defaultInnerClass = d.new DefaultInnerClass();
		ProtectedInnerClass protectedInnerClass = d.new ProtectedInnerClass();
		PublicInnerClass publicInnerClass = d.new PublicInnerClass();
		
		//Accessing Variables 
		//d.privateVar = 10; //Can't Access Private Variable
		d.defaultVar = 20;
		d.protectedVar = 30;
		d.publicVar = 40;
		
		//Accessing Methods
		//d.privateMethod();  //Can't Access Private Method
		d.defaultMethod();
		d.protectedMethod();
		d.publicMethod();
	}
	
	
}
