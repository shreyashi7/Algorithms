package LinkedList;
import java.util.LinkedList;
public class MergeSortedList {

	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next =null;
		}
		
	}
	 Node head;
	
	public Node Merge(Node l1, Node l2){
		Node result = null;
		Node lastLink = result;
		
		if(l1 == null){
			if(lastLink == null){
				lastLink = l2;
			}
			else{
				lastLink.next = l2;
			}
			
			
			}
			
		if(l2 == null){
			if(lastLink == null){
				lastLink = l1;
			}
			else{
				lastLink.next = l1;
			}
		}	
		
		if(l1.data<l2.data){
			if(lastLink == null){
				lastLink = l1;
				result = lastLink;
			}
			else{
				lastLink.next = l1;
				lastLink = lastLink.next;
			}
			l1 = l1.next;
		}
		else{
			if(lastLink == null){
				lastLink = l2;
				result = lastLink;
			}
			else{
				lastLink.next = l2;
				lastLink = lastLink.next;
			}
			l2 = l2.next;
		}
		
		return result;
	}
	
	public static void printlist(Node node){
		Node temp = node;
		while(temp!=null){
			System.out.println(temp.data);
		}
	}
	
	public static void main(String[] args){
		MergeSortedList merge = new MergeSortedList();
		Node l1 = new Node(4);
		l1.next = new Node(12);
		l1.next.next = new Node(23);
		
		Node l2 = new Node(10);
		l2.next = new Node(23);
		l2.next.next = new Node(98);
		
		Node result = merge.Merge(l1,l2);
		merge.printlist(result);

	}
}
