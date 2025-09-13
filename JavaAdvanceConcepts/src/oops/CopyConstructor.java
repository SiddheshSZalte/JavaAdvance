package oops;
class student{
	int age;
	String name;
	void PrintInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	student(student s2){
		this.name = name;
		this.age = age;
	}
	student(){
		
	}
}

public class CopyConstructor {
	public static void main(String args[]) {
		student s2 = new student(); 
		student s1 = new student(s2);
		s1.name = "Siddhesh";
		s1.age = 22;
		s1.PrintInfo();
	}

}
