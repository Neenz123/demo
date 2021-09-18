package binary;

public class Depth {
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(8);
		root.left.right.right = new Node(9);
		root.left.right.left.right = new Node(10);
		
		System.out.println(depth(root));
		
	}
	
	public static int depth(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftDepth = depth(root.left);
		int rightDepth = depth(root.right);
		
		return Math.max(leftDepth, rightDepth)+1;
	}

}
