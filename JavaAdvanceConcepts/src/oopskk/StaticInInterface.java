package oopskk;
interface Stat{
	static void Print() {// static has body in Interfaces
		System.out.println("Static method in Interface");
	}
}
public class StaticInInterface {
public static void main (String args[]) {
	Stat.Print();// calling static method directly from interface 
}
}
