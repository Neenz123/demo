package binary;

import java.util.ArrayList;

public class PathSum {
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
		int sum = 10;
		int sumSoFar =0;
		ArrayList<Integer> path = new ArrayList<>();
		pathSum(root1, sum, sumSoFar, path);
	}

	private static void pathSum(Node root, int sum, int sumSoFar, ArrayList<Integer> path) {
		if(root == null) {
			return;
		}
		
		sumSoFar +=root.data;
		path.add(root.data);
		
		if(sum == sumSoFar) {
			for(int i: path) {
				System.out.println(i);
			}
		}
		pathSum(root.left, sum, sumSoFar, path);
		pathSum(root.right, sum, sumSoFar, path);
		
		path.remove(path.size()-1);
		
	}
}
