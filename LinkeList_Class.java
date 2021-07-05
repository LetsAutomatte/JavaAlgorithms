package DataStructure.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkeList_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// LL is a default class in Java
// It can be use as stack , queue or list
//dynamic 
// allow null values
// not synchronized
// manipulation is easy
		
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.add(12);
		ll.add(null);
		ll.add("abc");
		ll.add(null);
		ll.add(12);
		
		System.out.println(ll);
		
		ll.addLast("last");
		ll.addFirst("first");
		ll.add(3, "mid");
		System.out.println("---------");
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println("---------");
		System.out.println(ll);
		System.out.println("---------");
		Iterator<Object> itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---------");
		
		Iterator<Object> itrDes = ll.descendingIterator();
		while(itrDes.hasNext())
		{
			System.out.println(itrDes.next());
		}
		
		System.out.println("---------");
		
		System.out.println("--get--"+ll.get(4));
		System.out.println("--size--"+ll.size());
	}

}
