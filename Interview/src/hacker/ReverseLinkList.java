package hacker;

public class ReverseLinkList {
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		Node result = reverse(head);
		
		while(result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	public static Node reverse(Node head) {
		if(head == null) {
			return head;
		}
		Node prev = null;
		Node current = head;
		while(current!=null) {
			Node nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		
		return prev;
	
	}
}
