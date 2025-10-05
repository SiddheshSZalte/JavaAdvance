package oopskk;
class Father{
	static void print() {// static method
		System.out.println("Father class");
	}
}
class Son extends Father{
        static  void print() {// trying to override a static method
		System.out.println("Son class");
	}
}

public class StaticOverRiding {
public static void main(String args[]) {
	Father s1 = new Son();// reference is father and object type is son
	s1.print();// it will print the method from father class failing method overriding 
	
}
}
