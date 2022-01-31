package oops;

public class MethodOverLoadingExample {
	
	//based on the number of arguments the function will be chosen
		//this is called overloading, it only happens in the same class unlike overriding
		
	
	public void sum(int a, int b) {
		
		int result = a+b;
		System.out.println("Sum is " + result);
		
	}
	
	public void sum(int a, int b, int c) {
		
		int result = a+b+c;
		System.out.println("Sum is " + result);
		
	}

}
