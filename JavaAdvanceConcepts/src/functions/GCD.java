package functions;
import java.util.*;
public class GCD {
	public static void GCD(int n1,int n2) {
		while(n1!=n2) {
			if (n1>n2) {
				n1 = n1 - n2;
			}else {
				n2 = n2-n1;
			}
		}
		
		System.out.println("Greatest Common Divisor is :"+n2);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		GCD(a,b);
	}

}
