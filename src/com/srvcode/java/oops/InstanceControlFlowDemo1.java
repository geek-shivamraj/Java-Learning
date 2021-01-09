package com.srvcode.java.oops;

public class InstanceControlFlowDemo1 {

	private static String m1 (String msg) {
		System.out.println(msg);
		return msg;
	}
	
	public InstanceControlFlowDemo1() {
		m = m1("1");
	}
	
	{
		m = m1("2");
	}
	String m = m1 ("3");
	
	public static void main(String[] args) {
		InstanceControlFlowDemo1 obj = new InstanceControlFlowDemo1();
	}
	
}
