package oops;
class Name{
	String name;
	Name(String name){
		this.name = name;
	}
}

public class Final {
public static void main(String args[]) {
	final int NUMBER = 2;// FINAL KEYWORD 
//	NUMBER = 6; CANNOT BE MODIFIED
	 Name n1 = new Name("Siddhesh");
	n1.name = "Aditya";
	// if a obj is final we can still change its value but cannot reassign it
	n1 = new Name("new name");
	System.out.println(n1.name);
}
}
