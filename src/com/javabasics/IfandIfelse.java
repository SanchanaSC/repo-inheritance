package com.javabasics;

public class IfandIfelse {
	
	public static void main(String[] args) {
		
		int money = 120;
		if(money >= 100) {
			System.out.println("Watch movie have fun");
		}
		
		int drivingage = 1;
		if(drivingage >= 18 && drivingage <= 62 ) {
			System.out.println("Eligible for driving license");
		} else {
			System.out.println("Not Eligible for driving license");
		}
		
		int number=12;
		if(number>=22 && number<=32) {
			System.out.println("Number is in Range");
			
		}else {
			System.out.println("Number is in not range");
		}
	}

}
