package hacker;

public class AddTailNode {
	
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
		Node result = addTailNode(head, 25);
		
		while(result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	public static Node addTailNode(Node head, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			return newNode;
		}
		Node currentNode = head;
		while(currentNode.next!=null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		return head;
	}
}
