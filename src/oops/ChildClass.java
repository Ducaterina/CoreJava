package oops;

public class ChildClass extends Person {
	
	//this is the child class
	
	String Profession;
	public ChildClass() {
	
	}
	public ChildClass(String Name, int Age, String Profession) {
		super(Name,Age);
	
	// "super" calls the constructor of the parent class
		this.Profession = Profession;
	
	}
	public void display() {
		
	//refer the method of the parent class
		//super.display();
		System.out.println("Inside Child");
		
		//the same function in the parent and child class is called method overriding (run-time polimorphysm)
		//compiletime = method overloading
		//it will display the child class methods
}
	public void print() {
		
		System.out.println("Inside Child");
}
}