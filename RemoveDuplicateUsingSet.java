package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("a","b","c","a","a","b","c","a","d"));
		System.out.println(arr);
		HashSet<String> hs = new HashSet<String>(arr);
		ArrayList<String> arr1 = new ArrayList<String>(hs);
		System.out.println(arr1);

	}

}
