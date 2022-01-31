package oops;

public class Employee {

	String Name;
	int EmployeeId;
	
	//int Salary;
	//if we want all the employees to have the same salary
	
	public static int Salary = 1500;
	public static String CompanyName = "Infosys";
		
	
	// creating a constructor to shorten the code
	//constructor must have the same name as the class;
	//& must never return any value
	//void is a returning function. We use it if we don't want to return anything
	//use the keyword to access something belong to the class (this.)
	
	public Employee(String Name, int EmployeeId, int Salary) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		Employee.Salary = Salary;
	
				
			}
	
	//can use multiple constructors, if you press CTRL and put the arrow on the object name (Employee), it will show you which constructor you're using 
	
	public Employee(String Name, int EmployeeId) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
	}
	
public void PrintAll() {
	//the access modifiers specify the accessibility of a data member, class, constructor or method
	//can be public, private, protected or default 
	
	
	System.out.println("Name of employee " + Name);
	System.out.println("EmployeeId " + EmployeeId);
	System.out.println("Salary " + Employee.Salary);
	System.out.println("CompanyName " + Employee.CompanyName);
		
	}
	//to change any static value do this. Need to call this method in the RunnerClass first

	public static void ChangeCompanyName() {
		Employee.CompanyName = "Googly eyes";
		
	}
}
