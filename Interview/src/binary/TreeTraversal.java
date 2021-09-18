package binary;

public class TreeTraversal {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int val){
			data = val;
		}
	}
	//1
	//2    3
	//4 5  6 7
	public static void main(String args[]) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);
		System.out.println("INORDER");
		inorderTraversal(root1);
		System.out.println("PREORDER");
		preOrderTraversal(root1);
		System.out.println("POSTORDER");
		postOrderTraversal(root1);
	}

	private static void inorderTraversal(Node root1) {
		if(root1 == null) {
			return;
		}
		inorderTraversal(root1.left);
		System.out.println(root1.data);
		inorderTraversal(root1.right);
	}
	
	private static void preOrderTraversal(Node root1) {
		if(root1 == null) {
			return;
		}
		System.out.println(root1.data);
		preOrderTraversal(root1.left);
		preOrderTraversal(root1.right);
	}
	private static void postOrderTraversal(Node root1) {
		if(root1 == null) {
			return;
		}
		postOrderTraversal(root1.left);
		postOrderTraversal(root1.right);
		System.out.println(root1.data);
	}
}
