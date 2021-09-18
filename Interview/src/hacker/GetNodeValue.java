package hacker;

public class GetNodeValue {
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
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		System.out.println(getNode(head, 2));
		
	}
	public static int getNode(Node head, int pos) {
		int count = 0;
		//Node current = head;
		Node pointer = head;
		/*
		 * while(count<=pos) { current = current.next; count += 1; }
		 * while(current!=null) { current = current.next; pointer = pointer.next; }
		 */
		while(head != null) {
			head = head.next;
			if(count<=pos) {
				count += 1;
			}else {
				pointer = pointer.next;
			}
		}
		
		return pointer.data;
	}
	
}
