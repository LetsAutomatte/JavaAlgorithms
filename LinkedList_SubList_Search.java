package DataStructure.Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//

public class LinkedList_SubList_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean found = false;
        
		
		LinkedList<Integer> ll = new LinkedList<>(new ArrayList<Integer>(Arrays.asList(34,90,56,12)));
		LinkedList<Integer> ll2 = new LinkedList<>(new ArrayList<Integer>(Arrays.asList(34,91)));
		for(int i=0;i<=ll2.size()-1;i++)
		{
			for(int j=0;j<=ll.size()-1;j++)
			{
				System.out.println(ll2.get(i));
				System.out.println(ll.get(j));
				if(ll2.get(i)==ll.get(j))
				{
					found = true;
					break;
				}
				else
				{
					found = false;	
				}
			}
			if(found)
			{
				continue;
			}
			else
			{
				System.out.println("here");
				found = false;
				System.out.println("Not sublist");
				break;
				
			}
			
			
		}
		if(found)
		{
			System.out.println("sublist");
			
		}
		
	}
	
	

}
