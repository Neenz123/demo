package revise;

public class PruneTree {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		//1
		//1 0
		//1 1 1 0
		Node root1 = new Node(1);
		root1.left = new Node(1);
		root1.right = new Node(0);
		root1.left.left = new Node(1);
		root1.left.right = new Node(1);
		root1.right.left = new Node(1);
		root1.right.right = new Node(0);
		
		print(prune(root1));
	}
	
	private static void  print(Node result) {
		if(result == null) {
				return;
		}
		print(result.left);
		System.out.println(result.data);
		print(result.right);
	}
	
	public static Node prune(Node root) {
		if(root == null) {
			return root;
		}
		
		containsOne(root);
		return root;
	}
	
	public static boolean containsOne(Node root) {
		if(root == null) return false;
		boolean leftContains = containsOne(root.left);
		boolean rightContains  = containsOne(root.right);
		if(!leftContains) {
			root.left = null;
		}
		if(!rightContains) {
			root.right = null;
		}
		
		return root.data ==1 || leftContains || rightContains;
	}
}
