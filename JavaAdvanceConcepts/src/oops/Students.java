package oops;
class Information{
	String name;
	int age;
	public void PrintInfo() {
		System.out.println("Name of Student:"+this.name);
		System.out.println("Age of Student:"+this.age);
		
	}
}
public class Students {
public static void main (String args[]) {
	Information s1 = new Information();
	s1.name = "Siddhesh";
	s1.age = 22;
	s1.PrintInfo();
}
}
