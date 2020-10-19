package com.cc.java;

public class SuperCat {

	// Fields
	private String name;
	private String furColor;
	
	protected int age;
	
	/**
	 * @param name
	 * @param furColor
	 * @param age
	 */
	public SuperCat(String name, String furColor, int age) {
		this.name = name;
		this.furColor = furColor;
		this.age = age;
	}
	
	protected String tellYourAttributes(String flag) {
		switch (flag) 
		{	
			case "#name":
				return "Name: " + name;
			case "#color":
				return "Fellfarbe: " + furColor;
			default:
				return "Something went wrong!";
		}	
	}

	
	
}
