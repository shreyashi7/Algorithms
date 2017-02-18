package LinkedList;

import LinkedList.ReverseLinkedList.Node;

public class RotateLinkedList {

	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static Node head;
	
	void printlist(Node head){
           Node temp = head;
           while(temp!=null){
        	   System.out.println(temp.data+" ");
        	   temp = temp.next;
           }
           System .out.println();
	}
	
	void rotate(int k){
		
		if(k == 0) return;
		
		Node current = head;
		
		int count = 1;
		
			while(count<k && current!=null){
				current = current.next;
				count++;
			}
			
			if(current == null) return;
			
			Node kthnode = current;
			
			while(current.next!=null){
				current = current.next;
			}
			
			current.next = head;
			
			head = kthnode.next;
			
			kthnode.next =null;
				
		
	
		}
	
	public static void main(String[] args){
		RotateLinkedList list = new RotateLinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.next = new Node(60);
        
        list.printlist(head);
        list.rotate(4);
        System.out.println(" ");
        list.printlist(head);

		
	}
}
