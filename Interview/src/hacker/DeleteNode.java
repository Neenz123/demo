package hacker;

public class DeleteNode {
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
		Node result = deleteNode(head, 2);
		
		while(result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	public static Node deleteNode(Node head, int pos) {
		if(head == null) {
			return head;
		}
		
		Node current = head;
		int count = 0;
		while(count<pos-1) {
			current = current.next;
			count += 1;
		}
		
		current.next = current.next.next;
		return head;
	}
}
