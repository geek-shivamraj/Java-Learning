package com.srvcode.java.oops;

public class InstanceControlFlowDemo {

	{
		System.out.println("First instance block.");
	}
	static {
		System.out.println("First static block.");
	}
	
	public InstanceControlFlowDemo() {
		System.out.println("Constructor.");
	}
	
	public static void main(String[] args) {
		InstanceControlFlowDemo instance1 = new InstanceControlFlowDemo();
		System.out.println("------Main------");
		InstanceControlFlowDemo instance2 = new InstanceControlFlowDemo();
	}
	
	static {
		System.out.println("Second static block.");
	}
	
	{
		System.out.println("Second instance block.");
	}
}
