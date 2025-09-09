package functions;

public class PowerCalculation {
 public static void main (String args[]) {
	 int n = 2;
	 int p = 5;
	 int power= 1;
	 for (int i = 1; i<=p;i++) {
		 power = power*n;
	 }
	 System.out.println(power);
 }
}
