package hacker;

public class CompareLinkList {
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node head1 = new Node(10);
		head1.next = new Node(20);
		head1.next.next = new Node(30);
		head1.next.next.next = new Node(40);
		Node head2 = new Node(10);
		head2.next = new Node(20);
		head2.next.next = new Node(30);
		head2.next.next.next = new Node(40);
		System.out.println(compare(head1, head2));
	}
	
	public static boolean compare(Node head1, Node head2) {
		if(head1 == null && head2 == null) return true;
		if(head1 == null && head2 != null) return false;
		if(head1 != null && head2 == null) return false;
		if(head1.data != head2.data) return false;
		return compare(head1.next, head2.next);
	}
}
