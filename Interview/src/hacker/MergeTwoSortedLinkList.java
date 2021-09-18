package hacker;

import hacker.CompareLinkList.Node;

public class MergeTwoSortedLinkList {
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
		Node head2 = new Node(15);
		head2.next = new Node(25);
		head2.next.next = new Node(35);
		head2.next.next.next = new Node(45);
		Node result = merge(head1, head2);
		while(result != null) {
			System.out.println(result.data);
			result = result.next;
		}
		
	}
	
	public static Node merge(Node head1, Node head2) {
		if(head1 == null) return head2;
		if(head2 == null) return head1;
		/*
		 * Node head3 = null; if(head1.data<head2.data) { head3 = head1; }else { head3 =
		 * head2; }
		 */
		Node head3 = new Node(0);
		Node refNode = head3;
		while(head1 != null && head2!= null) {
			if(head1.data<head2.data) {
				head3.next = head1;
				head1 = head1.next;
			}else {
				head3.next = head2;
				head2 = head2.next;
			}
			
			head3 = head3.next;
		}
		
		if(head1!= null) {
			head3.next = head1;
		}
		if(head2!=null) {
			head3.next = head2;
		}
		return refNode.next;
	}
}
