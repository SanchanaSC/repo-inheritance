package com.javabasics;

public class BasicsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("========While loop=================");	
	int a =1; //start
		while(a<4) {  //condition
			System.out.println(a);
			a++;     //updation
		}

	
	System.out.println("========do while loop=================");
	int b = 4 ;
	do {
		System.out.println("b:"+b);
		b++;
	}while(b<4);
	
	System.out.println("========For loop=================");
	for(int i=1; i<4; i++) {
		System.out.println("i:"+i);
	}
	
	for(int i=1;i<4;i++) {
		
		System.out.println("***\n");
	}
	
	}
}
