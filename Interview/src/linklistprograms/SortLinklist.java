 package linklistprograms;

public class SortLinklist {
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		
		Node head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(5);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(2);
		sortList(head);
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static Node sortList(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		Node temp = head;
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		temp.next = null;
		Node left = sortList(head);
		Node right = sortList(slow);
		return mergeList(left, right);
	}
	
	public static Node mergeList(Node left, Node right) {
		Node temp = new Node(0);
		Node currentNode = temp;  
		while(left != null && right != null) {
			if(left.data<right.data) {
				currentNode.next = left;
				left = left.next;
			}else {
				currentNode.next = right;
				right = right.next;
			}
			currentNode = currentNode.next;
		}
		
		if(left!=null) {
			currentNode.next = left;
		}
		if(right!=null) {
			currentNode.next = right;
		}
		return temp.next;
	}
}