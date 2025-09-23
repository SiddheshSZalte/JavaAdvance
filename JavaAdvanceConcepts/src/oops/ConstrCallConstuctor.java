package oops;
class Constructor1{
	String name;
	int Roll;
	Constructor1(){
		this("Pranav",69);
		System.out.println("Normal Constructor called");
		// calling another constructor from this constructor
	}
	Constructor1(String name, int a){
		this.name = name;
		this.Roll = a;
		System.out.println("Second Constructor called");
	}
}
public class ConstrCallConstuctor {
	public static void main(String args[]) {
Constructor1 c1 = new Constructor1();
System.out.println("name:"+c1.name);
	}
}
