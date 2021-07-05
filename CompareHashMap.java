package DataStructure.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map1 = new HashMap<String,String>();
		map1.put("A", "A");
		map1.put("B", "B");
		map1.put("C", "C");
		map1.put("D", "D");
		map1.put("E", "E");
		
		
		HashMap<String,String> map2 = new HashMap<String,String>();
		map2.put("A", "A");
		map2.put("B", "B");
		map2.put("C", "C");
		map2.put("D", "D");
		map2.put("E", "E");
		

		HashMap<String,String> map3 = new HashMap<String,String>();
		map3.put("A", "A");
		map3.put("B", "B");
		map3.put("C", "C");
		map3.put("D", "D");
		map3.put("L", "E");
		
		// comparing the key value
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//comparing the keyset() // keyset alwaysreturns the set
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map2.keySet().equals(map3.keySet()));
		
		//finding the missing key in the hashmap
		HashSet<String> combinedKeys = new HashSet<String>(map1.keySet());
		combinedKeys.addAll(map3.keySet());
		System.out.println("combinedKeys"+combinedKeys);
		combinedKeys.removeAll(map1.keySet());
		System.out.println("combinedKeys"+combinedKeys);
		
		//comapring the maps with value
		HashMap<String,String> map4 = new HashMap<String,String>();
		map4.put("A", "A");
		map4.put("B", "B");
		map4.put("C", "C");
		map4.put("D", "D");
		map4.put("E", "E");
		
		
		HashMap<String,String> map5 = new HashMap<String,String>();
		map5.put("A", "A");
		map5.put("B", "B");
		map5.put("C", "C");
		map5.put("D", "D");
		map5.put("E", "E");
		

		HashMap<String,String> map6 = new HashMap<String,String>();
		map5.put("A", "A");
		map5.put("B", "B");
		map5.put("C", "C");
		map5.put("D", "D");
		map5.put("E", "E");
	
		
		//1. using the ArrayList -- 
		System.out.println("test values --> "+new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));
		System.out.println("test values --> "+new ArrayList<>(map4.values()).equals(new ArrayList<>(map6.values())));
		
		
		//1. using the ArrayList -- Hashset
	 System.out.println("test values --> "+new HashSet<>(map4.values()).equals(new HashSet<>(map5.values())));
	System.out.println("test values --> "+new HashSet<>(map4.values()).equals(new HashSet<>(map6.values())));

}
}
