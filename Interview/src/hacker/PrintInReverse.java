package hacker;

public class PrintInReverse {
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
		printInReverse(head);
	}
	
	public static void printInReverse(Node head) {
		if(head != null) {
			printInReverse(head.next);
			System.out.println(head.data);
		}
	}
}
