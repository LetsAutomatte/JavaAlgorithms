package DataStructure.LinkedList;

public class DoublyLinkeListImpl {
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		Node previous;
		Node(int data)
		{
			this.data =data;
			 next =null;
			 previous = null;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkeListImpl dl = new DoublyLinkeListImpl();
		Node firstNode = dl.new Node(10);
		dl.head = firstNode;
		dl.tail = null;
		Node secondNode = dl.new Node(20);
		firstNode.next = secondNode;
		secondNode.previous = firstNode;
		dl.tail = secondNode;
		Node thirdNode = dl.new Node(30);
		secondNode.next = thirdNode;
		thirdNode.previous = secondNode;
		dl.tail = thirdNode;
		dl.printSequence();
		dl.printReverse();

	}
   public void printSequence()
   {
	   Node n = head;
	   while(n!=null)
	   {
		   System.out.println(n.data);
		   n = n.next;
	   }
	   
   }
   
   public void printReverse()
   {
	   System.out.println("---------------------");
	  Node  n = tail;
	  while (n!=null)
	  {
		  System.out.println(n.data);
		  n = n.previous;
		  
	  }
   }
}
