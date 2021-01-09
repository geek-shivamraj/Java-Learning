package com.srvcode.java.oops;

class ParentInstance {
	int i = 10;
	{
		System.out.println("Parent instance block.");
		m1();
	}
	
	public ParentInstance() {
		System.out.println("Parent constructor.");
	}
	
	public static void main(String[] args) {
		ParentInstance P = new ParentInstance();
		System.out.println("Parent main.");
	}
	
	public void m1 () {
		System.out.println("j : " + j);
	}
	int j = 20;
}

class ChildInstance extends ParentInstance {
	int x = 100;
	{
		System.out.println("Child first instance block.");
		m2();
	}
	
	public ChildInstance() {
		System.out.println("Child constructor.");
	}
	
	public static void main(String[] args) {
		ChildInstance c = new ChildInstance();
		System.out.println("Child main");
	}
	
	public void m2() {
		System.out.println("y : " + y);
	}
	{
		System.out.println("Child second instance block.");
	}
	int y = 200;
}

