package Stacks;
import java.util.Stack;
public class SortStack {

	public static void sort(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		int temp = stack.pop();
		sort(stack);
		putSorted(stack, temp);
	}
	
	public static void putSorted(Stack<Integer> stack, int item){
		if(stack.isEmpty() || stack.peek()<item){
			stack.push(item);
		}
		else{
			int temp = stack.pop();
			putSorted(stack, item);
			stack.push(temp);
			
		}
	}
	
	
	public static void main(String[] args){
		Stack<Integer> stack = new Stack();
		stack.push(4);
		stack.push(5);
		stack.push(1);
		stack.push(3);
		stack.push(2);
		
		for(int i=0;i<stack.size();i++){
			System.out.println(stack.elementAt(i)+" ");
		}
		
		sort(stack);
		
		for(int i=0;i<stack.size();i++){
			System.out.println(stack.elementAt(i)+" ");
		}

	}
}
