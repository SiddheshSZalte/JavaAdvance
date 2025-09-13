package oops;
class Student2{
	String name;
	int age;

	void PrintInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	
	    Student2(String a , int b ){
		this.name = a;
		this.age = b;
	}
	

}
public class ParamaterisedConstructor {
	public static void main (String args[]) {
		Student2 s1 = new Student2("Siddhesh",22);
	
	  
	   s1.PrintInfo();
	}
}
