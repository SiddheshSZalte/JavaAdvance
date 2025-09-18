package oops;
class Account{
	public String name;
	int age;
	protected String email;
	private String password;
	public void setPassword(String pass) {//setter
		this.password = pass;
	}
	public String getPassword() {//getter
		return this.password;
	}
	 void Print() {
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
		System.out.println("email:"+this.email);
		System.out.println("password:"+this.password);
		
	}
}

public class AccessModifiers {
	public static void main(String args[]) {
		Account a1 = new Account ();
		a1.name = "Siddhesh";
		a1.age = 22;
		a1.email = "Sidz21@gmail.com";
		String password = "sid";
		a1.setPassword(password);
		System.out.println(a1.getPassword());
		a1.Print();
	}

}
