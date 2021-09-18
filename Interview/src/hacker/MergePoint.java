package hacker;

import hacker.CompareLinkList.Node;

public class MergePoint {
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node head3 = new Node(30);
		head3.next = new Node(40);
		Node head1 = new Node(10);
		head1.next = new Node(21);
		head1.next.next = head3;
		
		Node head2 = new Node(100);
		head2.next = new Node(201);
		head2.next.next = head3;
		
		
		
		System.out.println(mergePoint(head1, head2));
	}
	
	public static int mergePoint(Node head1, Node head2) {
		Node refHead1 = head1;
		Node refHead2 = head2;
		
		while(refHead1 != refHead2) {
			if(refHead1.next == null) {
				refHead1 = head2;
			}else {
				refHead1 = refHead1.next;
			}
			if(refHead2.next == null) {
				refHead2 = head1;
			}else {
				refHead2 = refHead2.next;
			}
			
		}	
		return refHead1.data;
		
	}	
	
}
