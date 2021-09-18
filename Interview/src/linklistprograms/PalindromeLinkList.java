package linklistprograms;

public class PalindromeLinkList {
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
		head.next.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);
		
		boolean isPalindrom = true;
		
		Node slow= head;
		Node fast = head.next;
		
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		fast = head;
		slow = reverse(slow);
		
		while(slow!=null && slow.next!=null) {
			if(slow.data != fast.data) {
				isPalindrom = false;
				break;
			}
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println(isPalindrom);
	}
	
	public static Node reverse(Node head) {
		Node prev = null;
		while(head != null) {
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next; 
		}
		return prev;
	}
}
