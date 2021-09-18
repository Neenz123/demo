package binary;

public class MergeBinaryTree {
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
		
		Node root2 = new Node(1);
		root2.left = new Node(2);
		root2.right = new Node(3);
		root2.left.left = new Node(4);
		root2.left.right = new Node(5);
		root2.right.left = new Node(6);
		root2.right.right = new Node(7);
		
		Node result = merge(root1, root2);
		
		print(result);
				
	}
	
	private static void  print(Node result) {
		if(result == null) {
				return;
		}
		print(result.left);
		System.out.println(result.data);
		print(result.right);
	}

	private static Node merge(Node root1, Node root2) {
		if(root1==null) {
			return root2;
		}
		if(root2 == null) {
			return root1;
		}
		
		root1.data += root2.data;
		root1.left = merge(root1.left, root2.left);
		root1.right = merge(root1.right, root2.right);
		return root1;
	}
}
