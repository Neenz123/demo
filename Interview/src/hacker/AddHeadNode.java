package hacker;

public class AddHeadNode {
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
		Node result = addHeadNode(head, 25);
		
		while(result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	public static Node addHeadNode(Node head, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			return newNode;
		}
		newNode.next = head;
		return newNode;
	}
}
