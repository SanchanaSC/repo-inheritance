package com.loops.starpatterns;

public class ButterflyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int row=1;row<n;row++) {
			for(int i=1;i<=row;i++)
				System.out.print("*");
			for(int i=row;i<n;i++)
				System.out.print(" ");
			for(int  i=row;i<n;i++)
				System.out.print(" ");
			for(int i=1;i<=row;i++)
				System.out.print("*");
			System.out.println();
		}
		for(int row=1;row<=n;row++) {
			for(int i=row;i<=n;i++)
				System.out.print("*");
			for(int i=1;i<row;i++)
				System.out.print(" ");
			for(int i=1;i<row;i++)
				System.out.print(" ");
			for(int i=row;i<=n;i++)
				System.out.print("*");
			System.out.println();
			

		}
	}

}
