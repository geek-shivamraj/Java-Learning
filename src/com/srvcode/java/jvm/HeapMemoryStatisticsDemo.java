package com.srvcode.java.jvm;

public class HeapMemoryStatisticsDemo {

	public static void main(String[] args) {
		double mb = 1024 * 1024;
		Runtime runtimeObj = Runtime.getRuntime();
		System.out.println("Max Memory/ Maximum heap size: " + runtimeObj.maxMemory()/mb + " mb.");
		System.out.println("Total Memory/ Minimum heap size: " + runtimeObj.totalMemory()/mb+ " mb.");
		System.out.println("Free Memory: " + runtimeObj.freeMemory()/mb+ " mb.");
		System.out.println("Consumed Memory: " + (runtimeObj.totalMemory() - runtimeObj.freeMemory())/mb+ " mb.");
	}
}
