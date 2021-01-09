package com.srvcode.java.lang;

import java.lang.reflect.Method;

public class GetClassMethodDemo {

	public static void main(String[] args) {

		int count = 0;
		Object obj = new String("srvcode");
		Class c = obj.getClass();
		
		System.out.println("Fully Qualified Name of the class : " + c.getName());
		
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m) {
			System.out.println(m1.getName());
			count++;
		}
		System.out.println("No of Methods : "+ count);
	}

}
