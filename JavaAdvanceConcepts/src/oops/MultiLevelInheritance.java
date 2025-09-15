package oops;
class Shape1{
	void PrintInfo() {
		System.out.println("Display Area");
	}	
}
class Triangle1 extends Shape1{
	int Area(int l, int b) {
		return l*b*(1/2);
	}
	//multilevel inheritance since a derived class is deriving from a 
	//already derived class
}
class RightTriangle extends Triangle1{
	void PrintArea(int h,int b) {
	System.out.println(h*b*1/2);
	}
}
public class MultiLevelInheritance {
     public static void  main(String args[]) {
	RightTriangle rt1 = new RightTriangle();
	rt1.PrintInfo();
	rt1.PrintArea(10,20);
}
}
