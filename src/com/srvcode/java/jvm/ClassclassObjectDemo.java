package com.srvcode.java.jvm;

import java.lang.reflect.*;

public class ClassclassObjectDemo
{
	public static void main(String[] args) throws ClassNotFoundException {

		int count = 0;
		Class c = Class.forName("com.srvcode.java.jvm.Student");
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m) {
			System.out.println(m1.getName());
			count++;
		}
		System.out.println("No of Methods : "+ count);
		
		// For multiple instances of a class (For e.g. Student), only one Class object will be created.
		Student student1 = new Student();
		Class class1 = student1.getClass();
		Student student2 = new Student();
		Class class2 = student2.getClass();
		System.out.println(class1.hashCode() + "---" + class2.hashCode() + " ---> is both hashCode equal ? : " + (class1 == class2));
	}
}

class Student {
    public String getName() {
		return "srvcode";
	}
	
	public int getMarks() {
		return 50;
	}
}