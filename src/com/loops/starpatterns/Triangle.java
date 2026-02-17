package com.loops.starpatterns;

public class Triangle {

	public static void main(String[] args) {
		int stars=0;
		stars++;
		for(int i=1;i<=stars;i++)
			System.out.print("*");
		System.out.println();
		
		stars++;
		for(int i=1;i<=stars;i++)
			System.out.print("*");
		System.out.println();
		
		stars++;
		for(int i=1;i<=stars;i++)
			System.out.print("*");
		System.out.println();
		
		stars++;
		for(int i=1;i<=stars;i++)
			System.out.print("*");
		System.out.println();
		
		System.out.println("=========================================");
		
		int n=4,star=0;
		for(int row = 1;row<=n;row++) {
			star++;
			for(int i=1;i<=star;i++)
				System.out.print("*");
			System.out.println();
			
		}
	}

}
