package com.srvcode.java.lang;

public class EqualsMethodDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("srvcode", 1);
		Student s2 = new Student("sam", 2);
		Student s3 = new Student("srvcode", 1);
		
		Student s4 = s1;
		/*
		 * Here Object class .equals() method gets executed
		 * which is meant for reference comparison.
		 */
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("srvcode".equals(s1));
		System.out.println(s1.equals(null));
	}
	
}
