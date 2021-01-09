package com.srvcode.java.lang;

public class Student {
	String name;
	int rollno;

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	/*public boolean equals(Object obj) {
		try {
			Student s = (Student) obj;
			if (name.equals(s.name) && rollno == s.rollno) {
				return true;
			}
			return false;

		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}

	}*/
	
	/*
	 * More efficient method
	 */
	public boolean equals(Object obj) {

		if(obj == this) {
			return true;
		}
	
		if(obj instanceof Student) {
			Student s = (Student) obj;
			if (name.equals(s.name) && rollno == s.rollno) {
				return true;
			}
			return false;
		}
		return false;
	}
}
