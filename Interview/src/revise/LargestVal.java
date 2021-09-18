package revise;

import java.util.ArrayList;
import java.util.List;

public class LargestVal {
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
		int level = 0;
		List<Integer> largestVal = new ArrayList<>();
		largestVal(root, largestVal, level);
		largestVal.forEach(i->System.out.println(i));
	}

	public static void largestVal(Node root, List<Integer> largestVal, int level) {
		if(root == null) {
			return;
		}
		
		if(largestVal.size() == level) {
			largestVal.add(root.data);
		}else {
			largestVal.set(level, Math.max(root.data, largestVal.get(level)));
		}
		
		largestVal(root.left,largestVal, level+1);
		largestVal(root.right,largestVal, level+1);
		
	}

}
