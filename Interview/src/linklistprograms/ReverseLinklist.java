package linklistprograms;

public class ReverseLinklist {
	
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
		
		//1->2->3->4->5-null
		//5->4->3->2->1->null
		
		Node result = reverseLinklist(head);
		while(result!=null) {
			System.out.println(result.data);
			result = result.next;
		}
		
	}
	
	public static Node reverseLinklist(Node head) {
		Node prev =null;
		while(head!=null) {
			Node next = head.next; //2->...
			head.next = prev;//1->null
			prev = head;//
			head = next;
			}
		return prev;
		}
	
}
