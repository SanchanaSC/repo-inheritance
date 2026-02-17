package com.javabasics;

public class Elseifladder {
  public static void main(String[] args) {
	int number = 23;
	if(number >= 22 && number <=32) {
		System.out.println("In the range");
	} else if(number < 22) {
		System.out.println("Below Range");
	}else {
		System.out.println("out of range");
	}
	
	int age = 34;
	if(age >= 22 && age <=32) {
		System.out.println("Eligible for marriage");
	} else if(age < 22) {
		System.out.println("Have some patience");
	}else {
		System.out.println("U have lot of patience");
	}
}
}
