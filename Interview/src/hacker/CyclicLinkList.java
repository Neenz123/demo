package hacker;

public class CyclicLinkList {
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
		head.next.next.next.next = head.next.next;
		System.out.println(isCyclicNode(head));
	}
	
	public static boolean isCyclicNode(Node head) {
		Node pointer1 = head;
		Node pointer2 = head.next;
		
		while(pointer2!=null) {
			if(pointer1 == pointer2) {
				return true;
			}
			pointer1 = pointer1.next;
			pointer2 = pointer2.next.next;
			
		}
		return false;
	}
}
