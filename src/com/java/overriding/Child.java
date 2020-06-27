package com.java.overriding;
class Child extends Parent {

    // Hiding Parent class's variable `x` by defining a variable in child class with same name.

    public String x = "Child`s Instance Variable";

    

    public void print() {

        System.out.print(x);

        // If we still want to access variable from super class, we do that by using `super.x`

        System.out.print(", " + super.x + "\n");
   

    }

}

