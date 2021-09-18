package linklistprograms;

public class DobleLinklistSort {

	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int val){
			data = val;
		}
	}
	
	public static void main(String args[]) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.prev = node1;
		
		node2.next = node3;
		node3.prev = node2;
		
		node3.next = node4;
		node4.prev = node3;
		
		
		
		Node result = reverseLinkList(node1);
		while(result != null) {
			System.out.println(result.data);
			result =result.next;
		}
	}
	
	public static Node reverseLinkList(Node head) {
		Node current = head;
		Node newHead = current;
		//1<->2<->3<->4<->5
		//
		while(current!=null) {
			Node prev = current.prev;
			current.prev = current.next;
			current.next = prev;
			newHead = current;
			current = current.prev;
		}
		return newHead;
	}
}
