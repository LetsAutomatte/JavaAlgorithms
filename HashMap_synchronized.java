package DataStructure.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_synchronized {
	
	public static void main(String[] args)
	{
		HashMap<String,String> map = new HashMap<String,String>();
	    map.put("A", "A");	
	    map.put("B", "C");	
	    map.put("C", "D");	
	    map.put("E", "F");	
	    
	    //Synchronized HashMap
	    Collections.synchronizedMap(map);
	    System.out.println(map);
	    
	    //ConcurrentHashMap
	    
	    ConcurrentHashMap<String,String> conMap = new ConcurrentHashMap<String,String>();
	    conMap.put("A", "A");	
	    conMap.put("B", "C");	
	    conMap.put("C", "D");	
	    conMap.put("E", "F");	
	    
	    System.out.println(conMap);
	}

}
