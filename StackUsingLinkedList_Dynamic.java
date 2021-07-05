package DataStructure;

public class StackUsingLinkedList_Dynamic {
	
	Node head;
	class Node
	{
		int value;
		Node next;
	}
	
	StackUsingLinkedList_Dynamic()
	{
		head = null;	
	}
	
	public void push(int n)
	{
		Node nextNode = head;
		head = new Node();
		head.value =n;
		head.next = nextNode;
	}

	
	public void pop()
	{
		if(head==null)
		{
			System.out.println("Stack is empty");
			
		}
		else
		{
		int value = head.value;
		head = head.next;
		System.out.println("element popped"+value);
		}
	}
	
	public static void main(String args[])
	{
	StackUsingLinkedList_Dynamic lList = new StackUsingLinkedList_Dynamic();
	lList.pop();
	lList.push(5);
	lList.push(10);
	lList.push(20);
	lList.push(30);
	lList.push(40);
	lList.pop();
	lList.pop();
	lList.pop();
	lList.pop();
	lList.pop();
	lList.pop();
	}
}
