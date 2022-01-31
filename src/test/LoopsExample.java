package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While Loop to print 1 to 10
		
		int num1 = 1;
		
		while(num1<=10) {
			
			// If my number is 5 I want to skip it
			
			if(num1==5) {
				num1 = num1+1;
				continue;
			}
			System.out.println(num1);
			num1 = num1+1;					
	
				}
		
		// For Loop to print 1 to 10, skip 5
		
		for(int count=1;count<=10;count++) {
			
			if(count==5) {
				continue;
			}
			System.out.println("inside for loop " + count);
		}
		
		// For Loop to print 10 to 1
		
		for (int count=10; count>=1;count--) 
		{
			System.out.println("The count value=" + count);
		}
		
		// Arrays with Loop
		
		int[] array1 = {20,30,40,50,60};
		
		for(int index=0;index<array1.length;index++) {
			
			System.out.println("Value inside array " + array1[index]);
		}
		
		for(int var1:array1) {
			System.out.println(var1);
		}
			
	}
		
	}

