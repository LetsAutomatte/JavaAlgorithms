package DataStructure.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Set_MathematicalOpertaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.addAll(new ArrayList(Arrays.asList(23,45,78,10,90)));

		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.addAll(new ArrayList(Arrays.asList(26,45,89,8,10,9)));
		
		
		//union
		HashSet<Integer> unionset = new HashSet<Integer>(set1);
		unionset.addAll(set2);
		System.out.println(unionset);
		
		//intersection (common in both
		HashSet<Integer> interset = new HashSet<Integer>(set1);
		interset.retainAll(set2);
		System.out.println(interset);
		
		// get the diffrence or missing
		HashSet<Integer> diffset = new HashSet<Integer>(set1);
		diffset.removeAll(set2);
		System.out.println(diffset);
		
		
	}

}
