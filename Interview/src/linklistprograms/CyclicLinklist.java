package linklistprograms;

public class CyclicLinklist {
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
		head.next.next.next.next = new Node(6);
		
		System.out.println(hasCycle(head));
	}
	
	public static boolean hasCycle(Node head) {
		if(head == null) {
			return false;
		}
		
		Node first = head;
		Node second = head.next;
		
		while(first!=second) {
			if(second == null || second.next == null) {
				return false;
			}
			first = first.next;
			second = second.next.next;
		}
		return true;
	}
}
