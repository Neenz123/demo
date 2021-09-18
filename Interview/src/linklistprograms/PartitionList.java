package linklistprograms;

public class PartitionList {
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(2);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		findPartitionList(head, 3);
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
		
		
	}
	
	public static Node findPartitionList(Node head, int x) {
		Node leftHead = new Node(0);
		Node rightHead = new Node(0);
		Node left = leftHead;
		Node right = rightHead;
		
		while(head!=null) {
			if(head.data<x) {
				left.next = head;
				left = left.next;
			}else {
				right.next = head;
				right = right.next;
			}
			head = head.next;
		}
		
		right.next = null;
		left.next = rightHead.next;
		
		return leftHead.next;
	}
}
