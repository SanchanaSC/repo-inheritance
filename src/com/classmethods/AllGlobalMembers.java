package com.classmethods;

public class AllGlobalMembers {
	
	static int value =3;
	int num = 45;		//global variable
	void run() {
		System.out.println("non static run method");
	}
	static void execute() {
		System.out.println("static execute method");
	}

	public static void main(String[] args) {
		
		int num=3;		//local variable
		System.out.println("Local value: n ="+num);
		System.out.println("=============================");
		System.out.println("Global static value: value = "+AllGlobalMembers.value);
		AllGlobalMembers.execute();
		System.out.println("=============================");
		
		//Object creation
		AllGlobalMembers object = new AllGlobalMembers();
		object.run();
		System.out.println("non static num ="+object.num);
		
		
	}

}
