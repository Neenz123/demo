package linklistprograms;

public class OddEvenLinkList {
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
		Node result = oddEven(head);
		while(result!=null) {
			System.out.println(result.data);
			result = result.next;
		}
		
	}
	
	public static Node oddEven(Node head) {
		if(head == null) {
			return head;
		}
		
		Node odd = head;
		Node even = head.next;
		Node evenHead = even;
		Node oddHead = odd;
		while(even != null && even.next!=null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return oddHead;
	}
}
