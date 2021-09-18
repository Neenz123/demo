package binary;

public class InvertBinaryTree {
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
		/*
		 * 4 2 5 1 6 3 7
		 */
		//print(root1);
		
		Node node = invertBinaryTree(root1);
		/*
		 * 7 3 6 1 5 2 4
		 */
		print(node);
	}
	
	private static void  print(Node result) {
		if(result == null) {
				return;
		}
		print(result.left);
		System.out.println(result.data);
		print(result.right);
	}

	private static Node invertBinaryTree(Node root1) {
		if(root1 == null) {
			return root1;
		}
		
		Node left = invertBinaryTree(root1.left);
		Node right = invertBinaryTree(root1.right);
		
		root1.left = right;
		root1.right = left;
		
		return root1;
	}
	
}
