package oops;
import java.util.*;
class Shape3{
	
	void PrintInfo() {
	System.out.println("Display area:");
}
}
class Triangle3 extends Shape3{
	void PrintArea(int l,int b) {
		System.out.println(l*b*1/2);
	}
}
class Circle extends Shape3{
	void PrintInfo(int r) {
		System.out.println(3.14*r*r);
	}
}// Hierarchical inheritance where 2 classes are Derived from base class
public class HierarchicalInheritance {

 public static void main(String arg[]) {
	Scanner sc = new Scanner (System.in);
	Circle c1 = new Circle();
	
	System.out.println("Enter radius:");
	int a = sc.nextInt();
	c1.PrintInfo();
	c1.PrintInfo(a);
	
	
 }
}
