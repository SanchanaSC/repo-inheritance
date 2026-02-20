package com.oop.inheritance;

class Car{
	String color;
	int speed;
	
	public void details() {
		System.out.println("Color:"+this.color);
		System.out.println("car runs at the speed:"+this.speed+"\n");
	}
}
class BMW extends Car{

	public BMW(String color,int speed) {
		super.color=color;
		super.speed=speed;
	}
	
}
class Audi extends Car{

	public Audi(String color,int speed) {
		super.color=color;
		super.speed=speed;
	}
	
}
class Swift extends Car{
	public Swift(String color,int speed) {
		super.color=color;
		super.speed=speed;
	}
}
public class UseCar {

	public static void main(String[] args) {
		Car c1 = new BMW("black",60);
	//	c1.color="black";
	//	c1.speed=60;
		c1.details();
		
		Car c2 = new Audi("White",100);
		//c2.color="White";
		//c2.speed=100;
		c2.details();
		
		Car c3 = new Swift("red",240);
	//	c3.color="Red";
	//	c3.speed=240;
		c3.details();

	}

}
