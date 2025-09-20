package oops;
abstract class Animal1{
	Animal1(){
		System.out.println("Animal Constructor called");
	}
}
class Tiger extends Animal1{
	Tiger(){
		System.out.println("Tiger Constructor called");
	}
}
class Cub extends Tiger{
	
	Cub(){
		System.out.println("You created a object of Cub");
	}
}
public class ConstructorChaining {
public static void main(String args[]) {
	Cub c1 = new Cub();
}// this is constructor chaining where when we create a object of derived class then 
//the constructor of the base class called first and then that of derived class
}
