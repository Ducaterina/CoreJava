package oops;

public abstract class BankExample {
	
	//this class will set an example for other classess
	//can contain non abstract methods as well
	//you can not initialize this class via an object
	//the only way to create the object is via the child class
	
	public abstract void checkBalance();
	
	public abstract void depositMoney();
	
	public abstract void withdrawMoney();
	
	public void Welcome() {
		System.out.println("Welcome to Bank");
	}
}
