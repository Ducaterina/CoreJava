package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					//MAP INTERFACE
	//Hashmap example
	//doesn't guarantee the order of entries
	//key (int) - value (string) pair
	//key can be any data type 
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(1, "Suraj");
		map1.put(2, "Niraj");
		map1.put(3, "Sam");
		map1.put(10, "Nil");
		
		System.out.println(map1);
		
	//update the data in the map
		
		map1.put(2, "John");
		
		System.out.println(map1);
		
	//delete the entry
		
		map1.remove(10);
		
		System.out.println(map1);
		
	//loop to iterate through the entire map
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet() ) {
		System.out.println(entry1.getKey());
		System.out.println(entry1.getValue());
		}
		
		for (Integer val: map1.keySet()) {
		System.out.println("Key is " + val);
		//System.out.println("Value is " + map1.get(val));
		}
		
		for (String val : map1.values()) {
		System.out.println("Values is " + val);
		}
		
	//linkedhash map always maintains the order of entries
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1, "Suraj");
		map2.put(2, "Niraj");
		map2.put(3, "Sam");
		map2.put(10, "Nil");
		
		System.out.println(map2);
		
	//Treemap always maintains the ascending order of keys
	
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1, "Suraj");
		map3.put(10, "Niraj");
		map3.put(3, "Sam");
		map3.put(2, "Nil");
		
		System.out.println(map3);
		
	//to get just one key-value pair
		
		System.out.println(map3.get(3));
		
		
		
	//String str1 = "Clean India Green India Love India";
	//count the words, how many times each word appears (once, twice)
	//key is the word, value is int
		//Clean - 1 etc
		
		
	}

}
