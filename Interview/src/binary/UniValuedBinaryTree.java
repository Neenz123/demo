package binary;

public class UniValuedBinaryTree {
	
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
		root1.left = new Node(1);
		root1.right = new Node(1);
		root1.left.left = new Node(1);
		root1.left.right = new Node(1);
		root1.right.left = new Node(1);
		System.out.println(isUnivalued(root1));
	}
	
	public static boolean isUnivalued(Node root) {
		boolean left = root.left ==null || root.data == root.left.data && isUnivalued(root.left);
		boolean right = root.right ==null || root.data == root.right.data && isUnivalued(root.right);
		return left && right;
	}

}
