package com.srvcode.java.oops;

class ParentVariable {
		int x = 888;
}

class ChildVariable extends ParentVariable {
		int x = 999;
}

public class OverridingVariables {

	public static void main(String[] args) {
		
		ParentVariable p1 = new ParentVariable();
		System.out.println(p1.x);	// 888
		
		ChildVariable c1 = new ChildVariable();
		System.out.println(c1.x);	// 999
		
		ParentVariable p2 = new ChildVariable();
		System.out.println(p2.x);	// 888
	}
}
