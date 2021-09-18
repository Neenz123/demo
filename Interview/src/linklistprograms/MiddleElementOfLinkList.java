package linklistprograms;

public class MiddleElementOfLinkList {
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}

	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		System.out.println(findMiddleElement(head));
	
	}
	
	public static int findMiddleElement(Node head) {
		if(head == null) {
			return -1;
		}
		
		Node pointer1 = head;
		Node pointer2 = head.next;
		
		while(pointer2!=null && pointer2.next!=null) {
			pointer1 = pointer1.next;
			pointer2= pointer2.next.next;
		}
		return pointer1.data;
	}
}
