package com.oop.inheritance;

class Parent{
	public void talent(){
		System.out.println("Study hard get job");
	}
}
class Child extends Parent{

	@Override
	public void talent() {
		System.out.println("Work on ur hobby enjoy life");
	}
	
}
class Child2 extends Parent{

	@Override
	public void talent() {
		System.out.println("I enjoy listen music");
	}

	

	
}
class Child3 extends Parent{

	
	@Override
	public void talent() {
		System.out.println("Dance");
	}

	public void Dance() {
	
		System.out.println("Dance");
	}
	
}
public class UseOverriding {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.talent();
		Parent p1 = new Child2();
		p1.talent();
		Parent p3 = new Child3();
		p3.talent();
		Child3 c =new Child3();
		c.Dance();

	}

}
