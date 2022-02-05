package collections;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1 = new LinkedList<String>();
		
		//the difference between arraylist is you can add values first and last 
		
		list1.add("John");
		list1.add("Donald");
		list1.addFirst("Rick");
		list1.add("Jack");
		list1.addLast("Kate"); //doesn't work...
		list1.add("Jack");
		list1.add(2,"Bharat"); //to add in the middle you need to indicate the index number
		
		System.out.println(list1);
		
		for(int index=0;index<list1.size();index++) {
			System.out.println(list1.get(index));
	}

}
}