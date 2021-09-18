package linklistprograms;

public class MergeSortedLinklist {
	
	static class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(4);
		
		
		Node head2 = new Node(1);
		head2.next = new Node(3);
		head2.next.next = new Node(4);
		
		Node result = merge(head1, head2);
		
		while(result!=null) {
			System.out.println(result.data);
			result = result.next;
		}
	}
	
	public static Node merge(Node head1, Node head2) {
		Node temp = new Node(0);
		Node currentNode = temp;
		if(head1 == null) {
			return head1;
		}
		if(head2 == null) {
			return head2;
		}
		
		while(head1 != null && head2 != null) {
			if(head1.data>head2.data) {
				currentNode.next = head2;
				head2 = head2.next;
			}else{
				currentNode.next = head1;
				head1 = head1.next;
			}
			currentNode = currentNode.next;
		}
		
		if(head1 != null) {
			currentNode.next = head1;
		}
		if(head2 != null) {
			currentNode.next = head2;
		}
		
		return temp.next;
		
	}

}
