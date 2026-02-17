package com.loops.starpatterns;

public class SquareMatrix {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
			System.out.print("*");
		System.out.println("@");
		for(int i=1;i<=3;i++)
			System.out.print("*");
		System.out.println("@");
		for(int i=1;i<=3;i++)
			System.out.print("*");
		System.out.println("@");
		System.out.println("================================================================");
		
		int n=8;
		for(int row=1;row<=n;row++) {
			for(int i=1;i<=n;i++)
				System.out.print("*");
			System.out.println("@");
		}
		System.out.println("================================================================");
			
		
  }

}
