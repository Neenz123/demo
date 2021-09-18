package linklistprograms;

public class AddTwoNumbers {
	
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}
	public static void main(String args[]) {
		Node head1 = new Node(2);
		head1.next = new Node(4);
		head1.next.next = new Node(3);
		
		
		Node head2 = new Node(5);
		head2.next = new Node(6);
		head2.next.next = new Node(4);
		head2.next.next.next = new Node(1);
		Node result = add(head1, head2);
		
		while(result!=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	public static Node add(Node head1, Node head2) {
		int carry = 0;
		Node dummyHead = new Node(0);
		Node l3 = dummyHead;
		while (head1 != null || head2 != null) {
			int val1 = (head1 != null) ? head1.data : 0;
			int val2 = (head2 != null) ? head2.data : 0;
			
			int currentSum = val1 + val2 + carry;
			carry = currentSum/10;
			int lastDigit = currentSum%10;
			Node newNode = new Node(lastDigit);
			l3.next = newNode;
			if(head1!= null) {
				head1 = head1.next;
			}
			if(head2!= null) {
				head2 = head2.next;
			}
			l3 = l3.next;
		}
		if(carry>0) {
			Node newNode = new Node(carry);
			l3.next = newNode;
			l3= l3.next;
		}
		return dummyHead.next;
	}

}
