package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> arraylist1 = new ArrayList<>(); 
		
		arraylist1.add("Raj"); //0 index
		arraylist1.add("Priya"); //1 index
		arraylist1.add("Reena"); //2 index
		arraylist1.add("Rohan"); //3 index
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1); //see the content of arraylist
		
		System.out.println("The element at 0 index is " + arraylist1.get(0)); //see the exact element of the arraylist
		arraylist1.remove(0); //remove the item from the list
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
		//to replace the value
		 arraylist1.set(1, "Supriya");
		
		//to see the value of elements in the arraylist we need to use the for loop
		 
		for(int index=0;index<arraylist1.size();index++) {
		 System.out.println(arraylist1.get(index));
		 }
		 
		 //OR 
		 
		 for(String name: arraylist1) {
			 System.out.println(name);
		 }
		 
		 //OR
		 Iterator<String> itr = arraylist1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 
		 //how to reverse arraylist
		 	
		 	Collections.reverse(arraylist1);
			System.out.println(arraylist1);
		 	
			 
		 //how to sort arraylist
		 
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		 
		 //how to sort arraylist in descending order
		
		Collections.sort(arraylist1, Collections.reverseOrder());
		System.out.println(arraylist1);
		
	}

	
		}
	
