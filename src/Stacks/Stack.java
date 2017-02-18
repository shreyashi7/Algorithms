package Stacks;

public class Stack {
	private int S[] = {1,3,8,9,15,17,12};
	private int top = -1;
	public boolean stackEmpty(int[] S){
	
		if(S[top] == 0){
			return true;
		}
		else
			return false;
	}
	public void push(int x){
	     top = top+1;
		S[top] = x;
	}
	
	public int pop()
	{
		if(stackEmpty(S) == true)
			System.out.println("error");
		else
			top= top-1;
		return S[top+1];
	}
	
	public static void main(String[] args){
		Stack st = new Stack();
		st.push(9);
		System.out.println("element pushed");
		st.push(11);
		System.out.println("element pushed");
		st.push(13);
		System.out.println("element pushed");
		st.pop();
		System.out.println("element popped");
	}

}
