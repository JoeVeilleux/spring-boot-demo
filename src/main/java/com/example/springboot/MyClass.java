package com.example.springboot;

public class MyClass {
	
	public String attr1;
	
	MyClass() {
		this.attr1 = "Value of attr1";
	}
	
	public String toString() {
		return "MyClass instance with attr1='" + this.attr1 + "'";
	}

}
