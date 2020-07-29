//
package com.telusko.demoproj;

/**
 * This class is . 
 * 
 * @author: Tân
 * @create_date: 28/07/2020
 */
public class Ailen {
	private int age;
	private Computer com;
	
	public Ailen() {
		System.out.println("Ailen object created..");
	}
	
	public void code() {
		System.out.println("I'm coding....");
		com.compile();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}	
}
