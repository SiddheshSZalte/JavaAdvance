package oops;
class Student3{
	String name;
	int age;
	void PrintInfo(String name) {
		System.out.println("Name:"+name);
			}
	void PrintInfo(int age) {
		System.out.println("Age:"+age);
			}
	void PrintInfo(String name,int age) {
		System.out.println("Name:"+name+" Age:"+age);
			}
	
}
public class FunctionOverloading {
	public static void main(String args[]) {
		Student3 s1 = new Student3();
		s1.PrintInfo("Siddhesh");
	    s1.PrintInfo("Siddhesh",22);
	    s1.PrintInfo(24);
		
	}

}
