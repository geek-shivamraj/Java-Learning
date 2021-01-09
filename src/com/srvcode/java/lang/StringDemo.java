package com.srvcode.java.lang;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "srv";
		str1.concat("code");
		System.out.println("str1 : " + str1 + " HashCode : " + str1.hashCode());
		
		String str2 = new String("srv");
		System.out.println("str2 : " + str2 + " HashCode : " + str2.hashCode());
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		/*StringBuffer sb = new StringBuffer("ganesh");
		sb.append(" chutiya");
		System.out.println(sb);
		
		StringBuilder sd = new StringBuilder("smart");
		sd.append(" sam");
		System.out.println(sd);*/
	}

}
