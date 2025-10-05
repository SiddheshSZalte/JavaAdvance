package oopskk;
class Number{
	int a = 10;
}
class Digit extends Number{
	int b = 20;
}

public class Experiment {
public static void main(String args[]) {
	Number d1 = new Digit();
	System.out.println(d1.a);
	//System.out.println(d1.b);// the reference decides what all can be
	         // accessed and object decides which to access and hence methods 
	        //can be overridden . here Number Class has no idea about b in
	  // child class and hence giving compile time error. If there was a variable 
	 // b in Number class then it would have printed that variable value 
	Digit d2 = new Digit();
	System.out.println(d2.b);// here it will print b , because reference is also
	                    // of digit class 
	
	
}
}
