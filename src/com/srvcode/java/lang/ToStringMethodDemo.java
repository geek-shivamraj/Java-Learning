package com.srvcode.java.lang;

import java.util.ArrayList;

public class ToStringMethodDemo {

	public static void main(String[] args) {
		Student s1 = new Student("srvcode", 1);
		Student s2 = new Student("codesrv", 2);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		
		System.out.println("----------------------");
		
		String s = new String("srvcode");
		System.out.println(s);
		
		System.out.println("----------------------");
		
		ArrayList<String> al = new ArrayList<>();
		al.add("srv");	al.add("code");
		System.out.println(al);
	}
}
