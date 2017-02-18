package Misc;

 
  class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
  };
 
public class ArbitPointer {
	
	public class Solution {
	    public RandomListNode copyRandomList(RandomListNode head) {                          //this solution uses constant space
	        
	        if(head == null) return null;
	        
	        RandomListNode p = head;
	        
	        while(p!=null)
	        {
	            RandomListNode next = p.next;                                             //the new copy node is inserted between the original node and the next node
	            RandomListNode copy = new RandomListNode(p.label);
	            p.next = copy;
	            copy.next = next;
	            p=next;
	        }
	        p=head;
	        while(p!=null)
	        {
	            if(p.random!=null)
	            p.next.random = p.random.next;                      // here the random point is assigned to each of the new node
	            
	            p=p.next.next;
	        }
	        p=head;
	        RandomListNode pseudoHead=new RandomListNode(head.label);                    
	        RandomListNode copy, copyIter = pseudoHead;
	        while(p!=null &&  p.next!=null)
	        {
	            RandomListNode next = p.next.next;                 //restoring the original list and extracting the copy list
	            copy = p.next;
	            copyIter.next = copy;
	            copyIter=copy;
	            p.next = next;
	           // copy = copy.next;
	            p=next;
	        }
	        return pseudoHead.next;
	    }
	}
}
