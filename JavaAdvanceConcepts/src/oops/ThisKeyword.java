package oops;
class Properties{
	String color ;
	String type;
	public void PrintProperties() {
		System.out.println("Color of Pen:"+this.color);
		System.out.println("Type of pen:"+this.type);
	}
}
public class ThisKeyword {
 public static void main(String args[]) {
	Properties p1 = new Properties();
	Properties p2 = new Properties();
	 p1.type = "Ballpoint";
	 p1.color = "Blue";
	 p2.type = "Gel";
	 p2.color = "Black";
 	 p1.PrintProperties();
	 p2.PrintProperties();
 }
}
