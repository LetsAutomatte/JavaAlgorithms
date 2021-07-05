package DataStructure.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Set<String> set = new HashSet<>();
		set.add("abc");
		set.add("123");
		set.add(null);
		set.add("abc");
		set.add("123");
		set.add("456");
		set.add("wer");
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
	}

}
