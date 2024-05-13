package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<>();
		
		// Create
		phoneBook.put("Will Smith", 1234567890);
		phoneBook.put("Emma Watson", 444444444);
		phoneBook.put("Daniel Radcliffe", 1111111111);
		phoneBook.put("Emma Watson", 222222222);
		phoneBook.put("Rupert Grint", 444444444);

		// Read
		// 1
		Set<String> allKeys = phoneBook.keySet();
		for(String eachKey: allKeys) {
			Integer eachValue = phoneBook.get(eachKey);
			System.out.println(eachKey + " : " + eachValue);
		}
		
		System.out.println("------------------");
		// 2
		Set<Entry<String, Integer>> allEntrySet = phoneBook.entrySet();	
		allEntrySet.forEach((eachEntry)->System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue()));
		
		System.out.println("------------------");
		// 3
		phoneBook.forEach((key, value)->System.out.println(key + " : " + value));
		System.out.println("------------------");
		
		// Update
		phoneBook.replace("Will Smith", 333333333);
		phoneBook.forEach((key, value)->System.out.println(key + " : " + value));
		System.out.println("------------------");
		
		// Delete
		phoneBook.remove("Rupert Grint");
		phoneBook.forEach((key, value)->System.out.println(key + " : " + value));
		System.out.println("------------------");

	}

}
