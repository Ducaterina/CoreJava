package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 242423;
		emp1.Salary = 1000;
				
		Employee emp2 = new Employee();
		
		emp2.Name = "Manesh";
		emp2.EmployeeId = 543458;
		emp2.Salary = 1200; */
		
		//we use /* ... */ to comment the code
		
		//this is the constructor
		Employee emp1 = new Employee ("Sachin",242423);
		Employee emp2 = new Employee ("Manesh",543453);
		Employee emp3 = new Employee ("Kate",010101);  
		Employee.ChangeCompanyName();
				
		emp1.PrintAll();
		emp2.PrintAll();
		emp3.PrintAll();
		
		
		
		//equals to System.out.println("Name of emp1 " + emp1.Name);
		//equals to System.out.println("Name of emp2 " + emp2.Name);
	

	Person per1 = new Person();
	Person per2 = new ChildClass();
	//we create a reference of the parent class, but in fact we're creating a childclass object
	//vice versa is not possible
	
	ChildClass child = new ChildClass();
	ChildClass child1 = new ChildClass("Rahul",30,"Actor");
	
	//child1.display();
	//per1.display();
	
	//per2.display();
	
	MethodOverLoadingExample obj = new MethodOverLoadingExample();
	obj.sum(4,  6);
	obj.sum(4,  6, 7);
	//based on the number of arguments the function will be chosen
	//this is called overloading, it only happens in the same class unlike overriding
	
	ICICBank bank1 = new ICICBank();
	bank1.Creditcard();
	bank1.Welcome();
	
	EncapsulationExample obj10 = new EncapsulationExample();
	obj10.setName("Rohit");
	obj10.setSalary(1500);
	System.out.println(obj10.getName());
	System.out.println(obj10.getSalary());
	}
}
