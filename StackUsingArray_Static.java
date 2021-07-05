
package DataStructure;

import java.util.Scanner;

public class StackUsingArray_Static {
	
	static int size;
	static int top;
	static int[] arr;

	StackUsingArray_Static(int size)
	{
		StackUsingArray_Static.size = size;
		StackUsingArray_Static.arr = new int[size];
		StackUsingArray_Static.top = -1;
	}
	
	public  static boolean isEmpty()
	{
		boolean result;
		
		if(top==-1)
			result=true;
		else
			result=false;
			
			
		
		return result;
	}
	
	public static boolean isFull()
	{
		boolean result;
		
		if(top==size-1)
			result=true;
		else
			result=false;
			
			
		
		return result;
	}
	
	public static void push()
	{
		if(isFull())
		{
			System.out.println("Stack is already full");	
		}
		else
		{
			System.out.println("top element before push"+top);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		int element = sc.nextInt();
		StackUsingArray_Static.arr[top+1] = element;
		top = top+1;
		System.out.println("element pushed successfully now top is"+top);
		}
	}
	
	public static void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty nothing to pop");	
		}
		else
		{
			System.out.println("op element before pop"+top);
		top = top-1;
		}
		System.out.println("element popped successfully now top is"+top);
	}
	
	public static void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");	
		}
		else
		{
			System.out.println("Top element is"+arr[top]);	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray_Static stackArray = new StackUsingArray_Static(5);
		peek();
		push();
		peek();
		pop();
		isEmpty();
		peek();
		push();
		push();
		push();
		push();
		push();
		isFull();
		
	}

}
