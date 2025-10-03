package oopskk;
class Shapes2{
	void area() {
		System.out.println("area of shapes 2");
	}// comment out this method to understand the reference type working
}
class Rectangle extends Shapes2{
	
	void area() {
		System.out.println("Area of Rectangle");
		}
}

public class OverRiding2 {
	public static void main(String args[]) {
		
		Shapes2 Obj2 = new Rectangle();
		Obj2.area();
		
	}

}
