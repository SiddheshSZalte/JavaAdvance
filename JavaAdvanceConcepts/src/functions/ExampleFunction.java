package functions;
import java.util.*;
public class ExampleFunction {
	public static  void Name(String a) {
		System.out.println("Name passed from main function is:"+a);
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name :");
		String a = sc.next();
	    Name(a);
		
		
	}

}
