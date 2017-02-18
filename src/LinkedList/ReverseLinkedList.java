package LinkedList;

public class ReverseLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node head;
	ReverseLinkedList(){
		head = null;
	}
    public Node reverse(Node node){
    	
    	Node prev = null;
    	Node current = node;
    	Node next = null;
		if (current==null){
			return null;
		}
		else{
			while(current!=null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
				
			}
			node = prev;
			return node;
		}
	}
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	public static void main(String[] args){
		
		ReverseLinkedList r = new ReverseLinkedList();
		r.head = new Node(85);
		r.head.next = new Node(15);
        r.head.next.next = new Node(4);
        r.head.next.next.next = new Node(20);
        r.printList(head);
        head = r.reverse(head);
        System.out.println("");
        r.printList(head);
	}

}
