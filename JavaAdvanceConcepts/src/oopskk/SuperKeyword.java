package oopskk;
class A{
	int length;
	int width ;
//	A(){
//		// this method reduces the need to write super() in child class
//	}
	A(int a ){
		this.length = a;
	}
}
class B extends A{
	int width;
	int height;
	B(int w,int h,int l ){
		super(l);// super() method for explicitly calling parent's 
		         //Parameterized constructor 
      this.width = w;
      this.height = h;
      super.width = 10;// super keyword for pointing the parent class width 
		
	}
}
public class SuperKeyword {
	public static void main(String args[]) {
		
		B b1 = new B( 10, 20, 30);
	
	}
	

}
