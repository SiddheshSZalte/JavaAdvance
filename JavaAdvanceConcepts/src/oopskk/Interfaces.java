package oopskk;
interface Engine{
	 int a = 10;// by variables are static and final hence needs to initialized
 void start();// by default abstract methods
 void stop();
 void brake();
}
interface Brakes{
	void brake();
}
interface Door{
   void doorNum();
}
 class Car implements Engine, Brakes,Door{
// needs to override all the abstract methods of interfaces implemented
	@Override
	public void doorNum() {
		System.out.println("4 doors");
	}

	@Override
	public void brake() {
		System.out.println("Stops cars");
	}

	@Override
	public void start() {
		System.out.println("starts the car");
	}

	@Override
	public void stop() {
		System.out.println("Stop that damn car");
		
	}
	 
 }
public class Interfaces {
public static void main(String args[]) {
	Car c1 = new Car();
	c1.brake();
	c1.doorNum();
	c1.start();
	c1.stop();
	Engine c2 = new Car();
//	c2.brake();   // now as reference is engine hence cannot access
//  c2.doorNum(); // methods other classes

	c2.start();
	c2.stop();
}
}
