package collections;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//SortedSet<String> allCountries = new TreeSet<>();
		//SortedSet<String> allCountries = new TreeSet<>((str1, str2)-> str2.compareTo(str1));
		SortedSet<String> allCountries = new TreeSet<>(Collections.reverseOrder());
		
		allCountries.add("India");
		allCountries.add("China");
		allCountries.add("Sri Lanka");
		allCountries.add("Nepal");
		allCountries.add("Pakistan");
		allCountries.add("Bangladesh");
		allCountries.add("Myanmar");
		allCountries.add("Sri Lanka");
		
		allCountries.forEach((eachCountry)-> System.out.println(eachCountry));
		
		System.out.println("-------------------");
		SortedSet<Room> allRooms = new TreeSet<>();
		
		allRooms.add(new Room(200,150,50));
		allRooms.add(new Room(300,250,150));
		allRooms.add(new Room(200,150,50));
		
		allRooms.forEach((eachRoom)-> System.out.println(eachRoom));
	}

}
