package com.classmethods;

public class GetFactorial {

	public static void main(String[] args) {
		GetFactorial.fact(5);

	}

	private static void fact(int num) {
		int prod=1;
		for(int i=1;i<=num;i++)
			prod=prod*i;
		System.out.println("Factorial:"+prod);
		
	}

}
