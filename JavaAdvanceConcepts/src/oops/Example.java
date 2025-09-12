package oops;

class Pen{
	String color;
	String type;
    public static void write(int a) {
	System.out.println("Number of pens received are:"+a);
}
}
public class Example {
	public static void main(String args[]) {
		Pen p1 = new Pen();
		p1.color="red";
		p1.type = "Ballpoint";
		int a  =14;
		p1.write(a);
	}

}
 
