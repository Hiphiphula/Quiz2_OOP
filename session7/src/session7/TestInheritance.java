package session7;

// Create class 2 classes
// first = Bicycle class and MountainBike Class


// Bicycle will have two attributes, gear and speed 
// Bicycle will have three methods; apply break, speedUp and toString()
class Bicycle{
	public int gear;
	public int speed;
	
//	constructor with two attributes
	public Bicycle(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement)
	{
		speed -= decrement;
	}
	
	public void speedUp(int increment)
	{
		speed += increment;
	}
	
	public String toString()
	{
		return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
	}
	
	
}

// Mountain Bike will have three attributes gear, speed, and seatHeight
// Mountainbike class has two methods toString and SetHeight
class MountainBike extends Bicycle{
	public int seatHeight;
	public int gear;
	public int speed;
	
	public MountainBike(int gear, int speed, int seatHeight){
		super(gear,speed);
		this.seatHeight = seatHeight;
	}
	
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}
	
	public String toString()
	{
		return (super.toString() + "\nseat height is " + seatHeight);
	}
	
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(2, 60, 25);
		System.out.println(mb.toString());
		mb.speedUp(1);
		System.out.println("After SpeedUp = " + mb.toString());
		mb.applyBrake(1);
		
	}

}
