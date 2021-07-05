package DataStructure.LinkedList;

public class LinkedListImpl {
	Node head;
	class Node
	{
	int data;
	Node next;

	
	Node(int data)
	{
		this.data = data;
		next = null;
		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListImpl ll = new LinkedListImpl();
		Node firstNode = ll.new Node(10);
		ll.head = firstNode;
		Node secNode = ll.new Node(20);
		firstNode.next = secNode;
		Node thirdNode = ll.new Node(30);
		secNode.next = thirdNode;
		Node fourthNode = ll.new Node(40);
		
		System.out.println(ll.toString());
		
		ll.printList();
	}
	
	public  void printList()
	{
		Node n =head;
		while(n!=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}

}
