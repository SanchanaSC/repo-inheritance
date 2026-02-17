package com.staticmethods;

public class Communication {

	public static void main(String[] args) {
		Communication.call("Anushka","Karthikeya");
		Communication.call("Rashmika","Srujan");

	}

	private static void call(String heroine, String hero) {
		System.out.println("heroine "+heroine+" is continuosly takling on mobile with "+hero);
		
	}

}
