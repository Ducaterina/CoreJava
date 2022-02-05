package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//First in first out (FIFO)
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Nick");
		pq1.add("Mathew");
		pq1.add("Lisa");
		
		System.out.println(pq1);
		
		//priorityqueue doesn't maintain any priority order
		
		pq1.peek(); //retrieve the first value
		System.out.println("First Element " + pq1.peek());
		pq1.poll(); //deletes the first element
		
		System.out.println(pq1);
		
		//arraydeque maintains the order in which the elements were added
		
		ArrayDeque<String> dq1 = new ArrayDeque<String>();
		
		dq1.add("Nick");
		dq1.add("Mathew");
		dq1.add("Lisa");
		
		//doesn't allow you to add null values unlike arraylist
		//duplicate values are allowed
		
		System.out.println(dq1);
		
		dq1.peek(); //shows the head of the queue
		dq1.peekFirst(); //returns the first element
		dq1.peekLast(); //returns the last element
		
		System.out.println(dq1.peek()); 
		System.out.println(dq1.peekFirst());
		System.out.println(dq1.peekLast());
		
		
		System.out.println(dq1.poll()); //remove the first element
		System.out.println(dq1.pollFirst());
		System.out.println(dq1.pollLast());
		
		System.out.println(dq1);
		
	}

}

