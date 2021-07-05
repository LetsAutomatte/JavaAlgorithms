package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveOddNumbers_OtherImpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		a.removeIf(num->!(num%2==0));
		System.out.println(a);

	
	// to retain only the value in the list
	ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Tom","Tom","Marry","Steeve","Tom","John"));
	ar.retainAll(Collections.singleton("Tom"));
	System.out.println(ar);
	
	ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("Tom","Tom","Marry","Steeve","Tom","John"));
	ar.retainAll(Collections.singleton("Tom"));
	System.out.println(ar);
	
	// to create the sublist
	ArrayList<String> subList = new ArrayList<String>(ar1.subList(0, 3));
	System.out.println(subList);

	
	// converting the arraylist to array
	
	ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("Tom","Tom","Marry","Steeve","Tom","John","Matelda"));
	Object[] objarray = ar2.toArray(); //To Arrayreturns the object list
	System.out.println(objarray);
}
}