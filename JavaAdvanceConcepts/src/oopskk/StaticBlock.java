package oopskk;

public class StaticBlock {
static int a = 4;
static int b;

    static {// this block only runs at the time of first object creation and hence the
    	// statement will only be printed for once 
	System.out.println("I will run for once only");
	b = a*4;
}
    public static void main(String args[]) {
    	StaticBlock s1 = new StaticBlock();
    	System.out.println(StaticBlock.b);
    	StaticBlock.b = 20;// this will set the value of b to 20 
    	System.out.println(StaticBlock.b);
    	StaticBlock b2 = new StaticBlock();// this time the static() will not run and 
    	System.out.println(StaticBlock.b);// hence the value will not change and the 
    	                                  // statement will also be not printed
    	
    }
}
