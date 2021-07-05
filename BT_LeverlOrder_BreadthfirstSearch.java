package DataStructure.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import DataStructure.BinaryTree.BT_Preorder_PostOrder_InOrder.Node;

public class BT_LeverlOrder_BreadthfirstSearch {
	
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
		
		levelOrder(root);
		
	}
	
	public static List<List<Integer>> levelOrder(Node root)
	{
		List<List<Integer>> result = new ArrayList<>();
		
		if(root==null)
		{
			return result;
		}
		else
		{
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			while(!q.isEmpty())
			{
			int treesize = q.size();
		
			for(int i= 0;i<=treesize-1;i++)
			{
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				Node currentNode = q.remove();
				
				list.add(currentNode.data);
				if(currentNode.left!=null)
				{
					list.add(currentNode.left.data);
					q.add(currentNode.left);
				}
				if(currentNode.right!=null)
				{
					list.add(currentNode.right.data);
					q.add(currentNode.right);
				}
				System.out.println(list);
				result.add(list);
				
			}
			
			}
			
		}
		
		return result;
		
		
	}

}
