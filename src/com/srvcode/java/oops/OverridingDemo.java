/*package com.srvcode.java.oops;

class Parent {
    public void m1 () {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    public void m1 () {
        System.out.println("Child 1");
    }
    
    public void m2 () {
    	System.out.println("Child 2");
    }
}

public class OverridingDemo {

	public static void main(String[] args) {

		Parent p1 = new Parent();
        p1.m1();        // Parent
        
        Child c1 = new Child();
        c1.m1();        // Child 1
        c1.m2();		// Child 2
        
        Parent p2 = new Child();
        p2.m1(); 		// Child 1
        //p2.m2();		// Parent class reference can't call child specific methods

	}

}
*/