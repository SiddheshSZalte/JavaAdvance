package oopskk;
class Box{
	int l,w,h;
	Box(int l,int w,int h){
	     this.l = l;
		this.w = w;
		this.h= h;
		
	}
}
class Boxweight extends Box{
	int weight ;
	Boxweight(int l, int w,int h,int weight){
		super(l,w,h);
		this.weight = weight;
	}
}
public class AccessInClass {
	public static void main(String args[]) {
		Boxweight box1 = new Boxweight (1,2,3,4);//obj of child class
	System.out.println(box1.l);// able to access property of parent class
	Box box2 = new Box(2,3,4);// obj of parent class
	//System.out.println(box2.weight);// unable to access property of child class
	
	Box box3 = new Boxweight(7,8,9,10);// obj of child class but reference is parent 
	                                  // class and the reference decides the access
	               //and hence the weight is initialized and the obj is of child class
	// yet it will not be allowed to access property of child class
	//System.out.println(box3.weight);
	
	//Boxweight box4 = new Box(5,6,7);// cannot happen as box has no idea about boxweight 
	                              
	}
}
