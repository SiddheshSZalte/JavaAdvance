package oopskk;
abstract class Mom{
	abstract void career();// abstract method without body
}
class Child extends Mom{
      void career() {// overriding abstract method
    	 System.out.println("Child class overriding abstract method");
      }    
}
class Daughter extends Mom{
	void career() {// overriding abstract method
		System.out.println("Daughter class Overriding abstract method");
	}
}

public class AbstractClass {
public static void main(String args[]) {
	//Mom m1 = new Mom();// cannot create object of abstract class
	Child s1 = new Child();
	Daughter d1 = new Daughter();
	Mom s2 = new Child();// it works this way also(reference of parent class)
	s1.career();
	d1.career();
	s2.career();
}
}
