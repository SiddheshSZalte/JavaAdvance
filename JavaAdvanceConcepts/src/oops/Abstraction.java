package oops;
abstract class Animal {
	abstract void walk();
	 public void eat() {
		System.out.println("eats grass");
	}
}
class Horse extends Animal{
	public void walk() {
		System.out.println("walks on 4 legs ");
	}
	
class Monkey extends Animal{
	public void walk() {
		System.out.println("walks on 2 legs");
	}
	
}
}

public class Abstraction {
	public static void main(String args[]) {
		Horse h1 = new Horse();
		h1.walk();
		h1.eat();
		//Animal a1  = new Animal(); this will give runtime error as abstract class
		//cannot be instantiated
	}

}
