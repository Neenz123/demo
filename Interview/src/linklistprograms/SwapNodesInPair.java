package linklistprograms;

public class SwapNodesInPair {
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
		Node result = swapNodesInPair(head);
		while(result!=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}

	private static Node swapNodesInPair(Node head) {
		if(head == null) {
			return head;
		}
		Node temp = new Node(0);
		temp.next = head;
		Node currentNode = temp;
		
		while(currentNode.next != null && currentNode.next.next != null) {
			Node firstNode = currentNode.next;
			Node secondNode = currentNode.next.next;
			firstNode.next = secondNode.next;
			currentNode.next = secondNode;
			secondNode.next = firstNode;
			currentNode = currentNode.next.next;
		}
		return temp.next;
	}
}
