package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> reversearraylist1 = new ArrayList<>(); 
		
		reversearraylist1.add("Raj"); //0 index
		reversearraylist1.add("Priya"); //1 index
		reversearraylist1.add("Reena"); //2 index
		reversearraylist1.add("Rohan"); //3 index
		
		System.out.println(reversearraylist1);
		
		//how to print in reverse order
		Collections.reverse(reversearraylist1);
		System.out.println(reversearraylist1);
		
		//how to sort arraylist
		 
				Collections.sort(reversearraylist1);
				System.out.println(reversearraylist1);
				 
		 //how to sort arraylist in descending order
				
				Collections.sort(reversearraylist1, Collections.reverseOrder());
				System.out.println(reversearraylist1);

	}

}
