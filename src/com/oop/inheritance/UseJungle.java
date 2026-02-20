package com.oop.inheritance;

class Animal{
	int legs;
	String sound;
	public Animal(int legs, String sound) {
		super();
		this.legs = legs;
		this.sound = sound;
	}
	@Override
	public String toString() {
		return "Animal [legs=" + legs + ", sound=" + sound + "]";
	}
	
	
	
}

class Tiger extends Animal{

	public Tiger(int legs, String sound) {
		super(legs, sound);
	}
	
}

class Kangaroo extends Animal{
	int hands;

	public Kangaroo(int legs, String sound, int hands) {
		super(legs, sound);
		this.hands = hands;
		
		
	}
	
	public String toString() {
		return super.toString()+"Human [hands=" + hands + "]";
	}

}
class Human extends Animal{
	int hands;

	public Human(int legs, String sound, int hands) {
		super(legs, sound);
		this.hands = hands;
		
		
	}

	@Override
	public String toString() {
		return super.toString()+"Human [hands=" + hands + "]";
	}
	
}
public class UseJungle {

	public static void main(String[] args) {
		Animal a = new Tiger(4,"Roars");
		Animal b= new Kangaroo(2,"Roars",2);
		Animal h = new Human(2,"speak",2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(h);
	}

}
