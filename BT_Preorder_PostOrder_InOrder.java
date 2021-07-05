package DataStructure.BinaryTree;

public class BT_Preorder_PostOrder_InOrder {
	


	public static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			left = null;
			right =null;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node root = new Node(10);
		Node node30 = new Node(30);
		Node node20 = new Node(20);
		Node node5 = new Node(5);
		Node node25 = new Node(25);
		Node node50 = new Node(50);
		Node node60 = new Node(60);
		Node node70 = new Node(70);
		
		root.left= node30;
		root.right = node60;
		
		node30.left = node20;
		node30.right = node25;
		node20.left = node5;
		
		node60.left = node50;
		node60.right = node70;
		System.out.println("PreOrder");
		preOrder(root);
		System.out.println("PostOrder");
		postOrder(root);
		System.out.println("Inrder");
		IntOrder(root);
	}
	
	public static void preOrder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
		
		preOrder(root.left);
		preOrder(root.right);
		}
	}
	
	public static void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
			
		}
	
	}
	public static void IntOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			System.out.println(root.data);
			postOrder(root.right);
			
			
		}

}
}