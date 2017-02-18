package Stacks;
import java.util.Stack;

public class ReverseStack {
	
	public static <T> void Reverse(Stack<T> stack){
		if(stack.isEmpty()){
			return;
		}
		T bottom = popBottom(stack);
		Reverse(stack);
		stack.push(bottom);
	}
	
	private static <T> T popBottom(Stack<T> stack){
		T top = stack.pop();
		
		if(stack.isEmpty()){
			return top;
		}
		else{
			T bottom = popBottom(stack);
			stack.push(top);
			return bottom;
		}
		
		
		
	}
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		 for(int i=0; i<stack.size();i++){
	        	System.out.println(stack.elementAt(i));
	        }
		 System.out.println();
        Reverse(stack);
        
        for(int i=0; i<stack.size();i++){
        	System.out.println(stack.elementAt(i)+" ");
        }
	}

}
