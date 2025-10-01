package oops;
class Shape1{
	Shape1(int a ){
		System.out.println(a);
		System.out.println("Constructor of Shape1");
	}
	void PrintInfo() {
		System.out.println("Display Area");
	}	
}
class Triangle1 extends Shape1{
	Triangle1(int a, int b){
		super(a);
		System.out.println(b);
		System.out.println("Constructor of triangle1");
	}
	int Area(int l, int b) {
		return l*b*(1/2);
	}
	//multilevel inheritance since a derived class is deriving from a 
	//already derived class
}
class RightTriangle extends Triangle1{
	RightTriangle(int a ,int b,int c){
		super(a,b);
		System.out.println(c);
		System.out.println("Constructor of RightTriangle");
	}
	void PrintArea(int h,int b) {
	System.out.println(h*b*1/2);

		
	}
	}

public class MultiLevelInheritance {
     public static void  main(String args[]) {
	RightTriangle rt1 = new RightTriangle(10,20,30);
	rt1.PrintInfo();
	rt1.PrintArea(10,20);
}
}
