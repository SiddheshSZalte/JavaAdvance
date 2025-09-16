package oops;
class Square extends Shape{
	void PrintArea(int l,int b) {
		System.out.println(l*b);
	}
}
public class HybridInheritance {
public static void main(String args[]) {
	Square s1 = new Square();
	s1.PrintInfo();
	s1.PrintArea(10, 13);
}
}
