package DataStructure.HashMap;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl_RedBlack_sorted_Min_Max_Less_More {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
      map.put(2000, "A");
      map.put(5000, "E");
      map.put(6000, "F");
      map.put(7000, "G");
      map.put(3000, "C");
      map.put(4000, "D");
      map.put(2100, "B");
      System.out.println(map);
      System.out.println("max"+map.lastKey());
      System.out.println("min"+map.firstKey());
      
      Set<Integer> setLessThen3k =  map.headMap(3000).keySet();
      System.out.println("setLessThen3k---"+setLessThen3k);
      
      Set<Integer> setLessgreater3k =  map.tailMap(3000).keySet();
      System.out.println("setLessThen3k---"+setLessgreater3k);
      
      

		TreeMap<String,Integer> Usermap = new TreeMap<String,Integer>();
		
		Usermap.put( "A",2000);
		Usermap.put( "F",8000);
		Usermap.put( "G",7000);
		Usermap.put( "C",3000);
		Usermap.put( "D",3000);
		Usermap.put( "E",9000);
		Usermap.put( "B",8000);
    System.out.println(map);
    System.out.println("max"+Usermap.lastKey());
    System.out.println("min"+Usermap.firstKey());
    

    
     
	}

}
