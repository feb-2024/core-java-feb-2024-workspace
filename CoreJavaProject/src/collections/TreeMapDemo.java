package collections;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// question
		// count the number of alphabets in a sentence and print the alphabet and count in ascending order of alphabet
		String sentence = "Hello this is a sentence which we are counting for the number of alphabets";
		// first lets ignore the case of the sentence
		String sentenceLower = sentence.toLowerCase();
		//SortedMap<Character, Integer> countMap = new TreeMap<>();
		SortedMap<Character, Integer> countMap = new TreeMap<>(Collections.reverseOrder());
		// get each character of the sentence using a for loop
		for(int i=0;i<sentenceLower.length();i++) {
			char ch = sentenceLower.charAt(i);
			if(countMap.containsKey(ch)) {
				countMap.replace(ch, countMap.get(ch) + 1); // ch is already present in the TreeMap
			} else {
				countMap.put(ch, 1); // ch is not present in the TreeMap
			}
		}
		// traverse and print the countMap
		countMap.forEach((key, value)-> System.out.println(key + " : " + value));
	}

}
