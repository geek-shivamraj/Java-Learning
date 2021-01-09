package com.srvcode.java.oops;


class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getSingletonObject() {
		return s;
	}
}

public class SingletonClassApproach1 {

	public static void main(String[] args) {
		Singleton singletonObj1 = Singleton.getSingletonObject();
		System.out.println("Obj1 Hashcode : " + singletonObj1.hashCode());
		
		Singleton singletonObj2 = Singleton.getSingletonObject();
		System.out.println("Obj2 Hashcode : " + singletonObj2.hashCode());
	}

}
