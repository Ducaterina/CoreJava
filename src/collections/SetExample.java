package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
	
	//doesn't allow you adding duplicate values
	//the data is stored in descending order
	//allows null value
	
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("name1");
		set1.add("name2");
		set1.add("name3");
		set1.add("name4");
		set1.add("name5");
		set1.add(null);
		
		System.out.println(set1);
		
	//no direct method to retrieve values, have to use iterator
		
	//no guarantee of the order 
		
		HashSet<String> set2 = new HashSet<String>();
		
		set2.add("Rick");
		set2.add("Raj");
		set2.add("Mira");
		set2.add("Reena");
		set2.add(null);
		
		System.out.println(set2);
		
	//to maintain the direct order of the values
	//the data is stored in the form of link list, can be retrieved fast
		
		LinkedHashSet<String> set3 = new LinkedHashSet<String>();
		
		set3.add("Rick");
		set3.add("Raj");
		set3.add("Mira");
		set3.add("Reena");
		set3.add(null);
		
		System.out.println(set3);
		
	//to retrieve the data in alphabetic order
	//doesn't allow null value
		
		TreeSet<String> set4 = new TreeSet<String>();
		
		set4.add("Rick");
		set4.add("Raj");
		set4.add("Mira");
		set4.add("Reena");
		//set4.add(null);
		
		System.out.println(set4);
		
		
		//delete all the duplicate words??
		//from the string "Clean World Green World"
		
		
		String str1 = "Clean World Green World";
		
		 HashSet<String> hs1 = new HashSet<String>();
		 for (String word : str1.split (" ")) {
		 hs1.add(word);
		 
		 }
				
		System.out.println(hs1);
		
		//String result = "Clean World Green"*/
		
	
	
		
	


	}
}
