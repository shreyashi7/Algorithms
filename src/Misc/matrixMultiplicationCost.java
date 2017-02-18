package Misc;

public class matrixMultiplicationCost {

	public int findCost(int a[]){
		int n = a.length;
		int q=0;
		int temp [][] = new int[n][n];
		for(int i=0; i<n; i++) // for length 1
		{
			temp[i][i] = 0;
			
		}
		
		for(int L=2;L<n;L++)
		{
			for(int i=0; i<n-1; i++){
				int j=i+1;
				temp[i][j] = 100000;
				for(int k=i+1; k<n; k++){
					q = temp[i][k] +temp[k][j]+ a[i]*a[j]*a[k];
					
					if(q<temp[i][j])
						temp[i][j] =q;
				}
			}
		}
		return temp[0][n-1];
	}
	
	public static void main(String[] args){
		matrixMultiplicationCost m= new matrixMultiplicationCost();
		int a[] = {4,2,3,5};
		int cost = m.findCost(a);
		System.out.println("The minimum cost is" +cost);
	}
}
