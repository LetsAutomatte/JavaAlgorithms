package DataStructure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import DataStructure.BinaryTree.BT_LeverlOrder_BreadthfirstSearch.Node;

public class BT_ReverseLevelOrder_DepthFirstSerach {

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
		
		ReverselevelOrder(root);
		
	}
	public static void ReverselevelOrder(Node root)
	{
		Queue<Node> q = new LinkedList<>();
		Stack<Integer> st = new Stack<Integer>();
		if(root==null)
		{
			System.out.println("tree is empty");
		}
		else
		{
			q.add(root);
			while(!q.isEmpty())
			{
				Node currentNode= q.remove();
				if(currentNode.right!=null)
				{
					q.add(currentNode.right);
					
				}
				if(currentNode.left!=null)
				{
					q.add(currentNode.left);
					
				}
				st.add(currentNode.data);
				
			}
			
			
			
			
		}
		for(Integer num : st)
		{
			System.out.println(num);
		}
	}

}
