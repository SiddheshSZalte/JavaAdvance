package oopskk;
class Human{
	int age;
	String name;
	static int population;
	 Human(int age, String name , int population) {
		this.age = age;
		this.name = name;
		Human.population = population;  
	}
}

public class Static {
	
public static void main(String args[]) {
	Human h1 = new Human(20,"Siddhesh",20);
     Human h2 = new Human(20,"Aditya",12);
 	 System.out.println(Human.population);// the latest population passed is same for 
 	  // all objects 
     System.out.println(Human.population);
     
}}
