package functions;
import java.util.*;
public class SumOF2Num {
	public static int SumOfNumbers(int a , int b) {
		return a+b;
		}

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter values for A and B:");
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    int sum = SumOfNumbers(a,b);
	    System.out.println("Sum:"+SumOfNumbers(a,b));
	}
}
