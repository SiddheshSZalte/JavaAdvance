package oopskk;
class Square {
	int length ;
	Square(int length){
		length = length;// this creates ambiguity and assigns length to itself 
		this.length = length;// this keyword	
	}
	Square(){
		// this method (always needs to be first line of constructor 
		this(12);// can be used to call another constructor from a constructor
	}
}
public class ThisKeyword {
public static void main(String args[]) {
	Square s1 = new Square(12);
	System.out.println(s1.length);
	Square s2 = new Square();
	System.out.println(s2.length);
}
}
