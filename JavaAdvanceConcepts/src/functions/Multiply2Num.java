package functions;
import java.util.*;
public class Multiply2Num {
   public static int Multiply(int a,int b) {
	   int product = a*b;
	   return product ;
}
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   System.out.println("product of !6 an 10 is:"+Multiply(a,b));
	   
   }
}
