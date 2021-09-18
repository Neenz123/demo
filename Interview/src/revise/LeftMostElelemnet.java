package revise;

import java.util.LinkedList;
import java.util.Queue;

public class LeftMostElelemnet {
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
		System.out.println(findLeftMostVal(root1));
	}
	
	public static int findLeftMostVal(Node root) {
		Queue<Node> stack = new LinkedList<>();
		stack.offer(root);
		
		while(!stack.isEmpty()) {
			root = stack.poll();
			if(root.right!=null) {
				stack.offer(root.right);
			}
			if(root.left!=null) {
				stack.offer(root.left);
			}
			
		}
		
		return root.data;
	}
}
