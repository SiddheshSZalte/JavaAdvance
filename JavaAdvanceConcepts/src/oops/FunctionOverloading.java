package oops;
class Student3{
	String name;
	int age;
	void PrintInfo(String name) {
		System.out.println("Name:"+name);
			}
	void PrintInfo(int age,String name) {
		System.out.println("Age:"+age);
			}
	void PrintInfo(String name,int age) {
		System.out.println("Name:"+name+" Age:"+age);
			}
	 int PrintInfo(int age) {
		return age+1;
			}
	
	
}
public class FunctionOverloading {
	public static void main(String args[]) {
		Student3 s1 = new Student3();
		s1.PrintInfo("Siddhesh");
	    s1.PrintInfo("Siddhesh",22);
	    int newage =s1.PrintInfo(24);
	    System.out.print("NewAge:"+newage);
		
	}

}
