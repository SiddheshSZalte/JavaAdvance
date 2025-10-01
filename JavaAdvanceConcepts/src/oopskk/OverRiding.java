package oopskk;
class Shapes{
	void area() {
		System.out.println("Area of Shapes");
		
	}
}
class Circle extends Shapes{
	@ Override
	void area() {
		System.out.println("Area of circle");
	}
}

public class OverRiding {
	public static void main(String args[]) {
		Shapes obj = new Circle();
		obj.area();
	}

}
