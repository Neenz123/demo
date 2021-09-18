package binary;

public class RangeSum {
	static int rangeSum =0;
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
		int l = 2;
		int r = 6;
		getRangeSum(root1, l, r);
		System.out.println(rangeSum);
		
	}
	
	public static void getRangeSum(Node root, int l, int r) {
		if(root != null) {
			if(root.data>=l && root.data<=r) {
				rangeSum += root.data;
			}
			getRangeSum(root.left, l, r);
			getRangeSum(root.right, l, r);
		}
	}

}
