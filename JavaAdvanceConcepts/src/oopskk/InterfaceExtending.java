package oopskk;
interface AA{
	void printA();
}
interface BB extends AA{
	void printB();
}

class Sidd implements BB{
	// declare this methods as public because interface methods are public and abstract 
	// by default so not declaring access modifier reduce the accessibility and gives error
	public void printB() {// method of class implemented
		System.out.println("overRiding method of B interface");
	}
	public void printA() {// need to override the methods of class A also as B extends A
		System.out.println("overRiding method of A interface");
		
	}
}
public class InterfaceExtending {
public static void main (String args[]) {
	Sidd s1 = new Sidd();
	s1.printB();
	s1.printA();
	}
}
