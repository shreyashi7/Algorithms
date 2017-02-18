package Misc;

public class sumOfIntegers {
	
	public int sum(int a , int b){
		while(b != 0)
		{
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
	
	public static void main(String[] args){
		sumOfIntegers s = new sumOfIntegers();
		int result = s.sum(4, 7);
		System.out.println(result);
	}

}
