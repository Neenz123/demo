package hacker;

import java.util.LinkedList;

public class LevelOrderTraversal {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);
		
		levelOrder(root1);
	}
	
	public static void levelOrder(Node root) {
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.data);
			
			if(node.left!=null) {
				queue.add(node.left);
			}
			if(node.right!=null) {
				queue.add(node.right);
			}
			
		}
	}
}
