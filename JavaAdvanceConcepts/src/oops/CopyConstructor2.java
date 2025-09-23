package oops;
class Copy{
	String name;
	int RNo ;
	Copy (String name, int rno){
	       this.name = name ;// here we can assign
		   this.RNo = rno;
	}
	
	Copy(Copy c1){
		this.name = c1.name;
		this.RNo = c1.RNo;
		
	}

}

public class CopyConstructor2 {
	public static void main(String args[]) {
    Copy c1 = new Copy("Siddhesh",70);
    Copy c2 = new Copy(c1);
    System.out.println("Copied Name: "+c2.name);
    System.out.println("Copied Roll No.:"+c2.RNo);
		
	}

}

