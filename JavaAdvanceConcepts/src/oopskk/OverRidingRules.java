package oopskk;
class Fruits{
	protected void FruitColor() {// to override the copy of method must be of 
		// protected or more wide access modifier
		System.out.println("Fruits Class");
	}
	Object word() {// covariant return type , search on chatgpt to understand
		return "Fruits";
	}
}
class Banana extends Fruits{
	public void FruitColor() {// more wide access than protected 
	System.out.println("Banana Class");	
	}
	String number() {
		return "Banana";
	}
}

public class OverRidingRules {
    public static void main(String args[]) {
    	Fruits obj1 = new Banana();
    	obj1.FruitColor();
    }
}
