package com.srvcode.java.oops;

import java.util.Objects;

class SingletonClass {
	private static SingletonClass s = null;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getSingletonObject() {
		if(Objects.isNull(s)) {
			s = new SingletonClass();
		}
		return s;
	}
}

public class SingletonClassApproach2 {

	public static void main(String[] args) {
		SingletonClass singletonObj1 = SingletonClass.getSingletonObject();
		System.out.println("Obj1 Hashcode : " + singletonObj1.hashCode());
		
		SingletonClass singletonObj2 = SingletonClass.getSingletonObject();
		System.out.println("Obj2 Hashcode : " + singletonObj2.hashCode());
	}

}
