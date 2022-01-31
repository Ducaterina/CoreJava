package oops;

public class Person {
	
	//this is the parent class
	
	public String Name;
	public int Age;
	
	public Person() { 
		//this default constructor is optional 
		
	}
	public Person(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	
	}
	public void display() {
			
			System.out.println("Inside Parent");
	}
	}
