package com.srvcode.java.oops;

public class StaticControlFlowDemo {

	static int i = 10;
	
	static {
		System.out.println("First static block.");
		System.out.println("i : " + i);
		m1 ();
	}
	
	public static void main(String[] args) {
		System.out.println("Main method.");
		m1 ();
	}
	
	public static void m1 () {
		System.out.println("j : " + j);
	}
	
	static {
		System.out.println("Second static block.");
	}
	
	static int j = 20;

}

class Test {
	static {
		System.out.print("Native Library pathe");
	}
}