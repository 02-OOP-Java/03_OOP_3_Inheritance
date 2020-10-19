package com.cc.java;

public class Tomcat extends SuperCat
{
	
	public Tomcat(String name, String furColor, int age) {
		super(name,furColor,age);
	}

	public String tellYourAge() {
		return "Alter: " + age;
	}
		
}
