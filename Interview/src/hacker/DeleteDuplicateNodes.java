package hacker;

public class DeleteDuplicateNodes {
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
		head.next.next.next.next = new Node(40);
		head.next.next.next.next.next = new Node(40);
		Node result = deleteDuplicateNode(head);
		
		while(result != null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	public static Node deleteDuplicateNode(Node head) {
		Node currentNode = head;
		while(currentNode.next!=null) {
			if(currentNode.data == currentNode.next.data) {
				currentNode.next = currentNode.next.next;
			}else {
				currentNode = currentNode.next;
			}
		}
		return head;
	}
}
