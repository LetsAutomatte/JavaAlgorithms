package DataStructure.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListMethods_Merge {

	
	public static void main(String[] args)
	{
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("abc");
		ar.add("zyc");
		ar.add("abc");
		ar.add("zyc");
		ar.add(null);
		ar.add("null");
		ar.add("123");
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Object> ar1 = new ArrayList<Object>();
		ar1.add("abc");
		ar1.add("zyc");
		ar1.add("abc");
		ar1.add("zyc");
		ar1.add(null);
		ar1.add("null");
		ar1.add(123);
		Iterator<Object> itr = ar1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ar.addAll(ar1);
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		//ar.clear();  // to delete the array
		
		//cloning
		ArrayList<String> mergeArr = (ArrayList<String>)ar.clone();
		System.out.println("--------------");
		System.out.println(mergeArr);
		
		System.out.println(ar.contains("null"));
		System.out.println(ar.contains(null));
		System.out.println(ar.contains("7879"));
		
		System.out.println(ar.indexOf(null));
		
		System.out.println(ar.indexOf(null)>0);
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("a","b","a","h","a"));
		System.out.println(list.lastIndexOf("a"));
		list.remove(4);
		System.out.println(list.lastIndexOf("a"));
		
		
		
		
	}
}
