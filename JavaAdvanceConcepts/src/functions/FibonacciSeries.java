package functions;
import java.util.*;
public class FibonacciSeries {
	public static void FibonacciSeries(int n ) {
		int first = 0 ;
	    int  second = 1;
	    int next;
		System.out.print(first + " ");
		System.out.print(second + " ");
	    
	    for (int i = 1;i<=n;i++) {
	    	next = first + second;
	    	System.out.print(next + " ");
	    	first = second;
	    	second = next ;
	    }
	    
	    
	}
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values you want in the series :");
		int n = sc.nextInt();
		FibonacciSeries(n );

		 sc.close();
	}
     
}

