package Queues;
import java.util.Stack;
public class UsingStacks {
	static Stack<Integer> stack1 = new Stack();
	static Stack<Integer> stack2 = new Stack();
	
	public static void main (String [] args){
		UsingStacks q = new UsingStacks();
		
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(3);
		q.enQueue(7);
		q.enQueue(2);
        for(int i=0; i<stack1.size();i++){
        	System.out.println(stack1.elementAt(i)+" ");
        }
    	System.out.println(" ");

        q.deQueue();
        
        for(int i=0; i<stack2.size();i++){
        	System.out.println(stack2.elementAt(i)+" ");
        }
        
        
		
	}
	
	public void enQueue(int item){
		stack1.push(item);
	}
	public int deQueue(){
		if(stack1.isEmpty() && stack2.isEmpty()){
			System.out.println("queue is empty");
			}
		else if(!stack1.isEmpty() && stack2.isEmpty()){
			stack2.push(stack1.pop());
		}
		
		return stack2.pop();
	}
	
}
