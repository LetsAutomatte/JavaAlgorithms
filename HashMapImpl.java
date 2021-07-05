package DataStructure.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,String> stateCap = new HashMap<String,String>();
		stateCap.put("KA", "Bangalore");
		stateCap.put("HR", "Chandighar");
		stateCap.put("PUN", "Chandighar");
		stateCap.put("RAJ", "Jaipur");
		
		Iterator<String> itr = stateCap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key+"Capital Is "+stateCap.get(key));
		}
	}

}
