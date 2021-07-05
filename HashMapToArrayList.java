package DataStructure.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> stateCap = new HashMap<String,String>();
		stateCap.put("KA", "Bangalore");
		stateCap.put("HR", "Chandighar");
		stateCap.put("PUN", "Chandighar");
		stateCap.put("RAJ", "Jaipur");
		
		Iterator<String> itr =  stateCap.keySet().iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println(key+"---"+stateCap.get(key));
		}
		ArrayList<String> arrKey = new  ArrayList<>(stateCap.keySet());

		System.out.println("Key List"+arrKey);
		ArrayList<String> arrValues = new  ArrayList<>(stateCap.values());
		System.out.println("Value List"+arrValues);
		
	}

}
