package patterns;

public class NumericalRectangularPattern {
	public static void method() {
		for (int i = 1;i<8;i++) {
			for (int j = i;j<8;j++) {
			System.out.print(j);
		}
			for(int j=1;j<i;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		method();
	}
}
