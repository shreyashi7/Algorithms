package LinkedList;

public class SortList {
         static class Node{
    	   Node next;
    	   int data;
    	   Node(int d){
    		   d = data;
    	   }
    	  
       }
       
       public Node mergeSort(Node head){
    	      if(head == null || head.next == null) return head;
    	      Node prev = null, slow =head, fast =head; 
    	      while (fast!=null && fast.next!=null){
    	    	  prev = slow;
    	    	  slow = slow.next;
    	    	  fast = fast.next.next;
    	      }
    	      prev.next =null;
    	      
    	      Node l1 = mergeSort(head);
    	      Node l2 = mergeSort(slow);
    	      
    	   return merge(l1, l2);
       } 
       Node merge(Node l1, Node l2){
    	   Node l = new Node(0);
    	   Node p = l;
    	   if(l1. data < l2.data){
    		   p.next = l1;
    		   l1 = l1.next;
    		   
    	   }
    	   else{
    		   p.next = l2;
    		   l2 = l2.next;
    	   }
    	   p = p.next;
    	   if(l1!=null){
    		   p.next = l1;
    	   }
    	   if(l2 !=null){
    		   p.next =l2;
    	   }
    	   return l.next;
       }
       
       public static void main(String[] args){
    	   SortList s = new SortList();
    	   Node head = new Node(5);
    	   s.mergeSort(head);
       }
       
}
