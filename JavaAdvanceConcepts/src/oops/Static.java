package oops;
class Example1{
	
	static void PrintStatic(){// static method 
		System.out.println("Called directly without of object");
		}
	void PrintNonStatic() {// normal method
		System.out.println("called BY creating object of the class");
	}
}


public class Static {
  int a = 10;// normal variable
  static int b = 20; // static variable
  public static void main(String args[]) {
	  Example1.PrintStatic();// static method called without creating object for the
	                         //class , just used class name as it is from another class,
	                     // if was from this class then we can call without giving the 
	                    // class name also
	  Example1 E1 = new Example1();
	  E1.PrintNonStatic();// normal method called using object 
	 System.out.println(b);// static variable directly called 
	 Static s1 = new Static();
	 System.out.println(s1.a);// normal variable needs object despite being from the same 
	                          //class

	  
  }
}
