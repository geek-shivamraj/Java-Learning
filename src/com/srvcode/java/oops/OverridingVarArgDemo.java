package com.srvcode.java.oops;

class ParentVarArg {
	public void m1(int... x) {
		System.out.println("Parent");
	}
}

class ChildVarArg extends ParentVarArg {
	public void m1(int... x) {
		System.out.println("Child");
	}
}

public class OverridingVarArgDemo {

	public static void main(String[] args) {
		
		ParentVarArg p1 = new ParentVarArg();
		p1.m1(10);									// Parent
		
		ChildVarArg c1 = new ChildVarArg();
		c1.m1(10);									// Child
		
		ParentVarArg p2 = new ChildVarArg();
		p2.m1(10);									// Child
	}
}
