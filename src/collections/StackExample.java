package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Last in First out (LIFO)
		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		//to add values to stack
		stack1.push(4);
		stack1.push(8);
		stack1.push(12);
		stack1.pop(); //will remove the value on the top
		stack1.push(3);
		
		
		System.out.println(stack1);
		System.out.println(stack1.peek()); //to show the top value
		System.out.println(stack1.firstElement());//to show the bottom element
		
	}

}
