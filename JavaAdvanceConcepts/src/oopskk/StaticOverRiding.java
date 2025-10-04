package oopskk;
class Father{
	static void print() {
		System.out.println("Father class");
	}
}
class Son extends Father{
	static void print() {
		System.out.println("Son class");
	}
}

public class StaticOverRiding {
public static void main(String args[]) {
	Father s1 = new Son();
	s1.print();
	
}
}
