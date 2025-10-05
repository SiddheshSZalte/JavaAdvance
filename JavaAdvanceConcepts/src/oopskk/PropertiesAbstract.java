package oopskk;
abstract class Papa{// we cannot have a final abstract class
	abstract void career();
	void printHey() {// we can have normal methods in abstract class
		System.out.println("hey");
	}
 final int VALUE;// we can have final variables and methods 
 
     Papa(int a){// we can have constructors also but not directly call them
    	 this.VALUE = a;
     }
   static void print() {
	   System.out.println("Static method in abstract class");
   }
//  abstract static void print2();// we can not have this
//   abstract Papa() ;// we cannot  have abstract constructors
	
}
 class Beta extends Papa{
	 void career() {
		 System.out.println("OverRiding abstract method is must");
	 }
	Beta(int age){
		super(age);// in order to call abstract class constructor which is needed to 
		          // initialize the final variable value
	}
 }
public class PropertiesAbstract {
	public static void main(String args[]) {
		Beta b1 = new Beta(20);// object of child class and 20 for initializing final 
		                       // variable in abstract class
		b1.printHey();// calling normal method from abstract class using object of
		              // derived class
		Papa.print();// calling static method using abstract class name
		b1.career();// calling abstract method
	}

}
