package oops;
class Shape{
	void PrintInfo() {
		System.out.println("Display Area:");
	}
}
class Triangle extends Shape{
	void Printarea(int l,int b) {
		System.out.println(l*b*1/2);
	}
	//  single level inheritance 1 base class and 1 derived class
	
}

public class SingleLevelInheritance {
     public static void main(String args[]) {
    	 Triangle t1 = new Triangle();
    	 t1.PrintInfo();
    	 t1.Printarea(10,12);
     }
}
