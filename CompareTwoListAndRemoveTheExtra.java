package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoListAndRemoveTheExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		
		// Finding the extra or distinct element in array
		
		l1.removeAll(l2);
		System.out.println("Distinct Elemet is "+l1);

		
		// Finding the common elements in array
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		l4.retainAll(l5);
		System.out.println("Distinct Elemet is "+l4);
		
	}

}
