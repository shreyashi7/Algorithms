package DP;

public class Knapsack {
	public int findWeight(int [] weights, int W, int val[]){
		
		
		int T[][] = new int[val.length+1][W+1];
		for(int i=0; i<val.length;i++){
			for(int j= 0; j<W; j++){
				if(i == 0 || j == 0){
                    T[i][j] = 0;
                    continue;
                }
				
				
				if(j - weights[i-1] >= 0) {
					T[i][j] = Math.max(T[i-1][j], val[i-1]+T[i-1][j-weights[i-1]]);
					
				}
				else{
					T[i][j] = T[i-1][j];
				
			}
			}
		}
		
		
		return T[val.length][W];
	}
	
	public static void main(String[] args){
		
	        Knapsack k = new Knapsack();
	        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
	        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
	        int r = k.findWeight(wt, 30, val);
	        System.out.println(r);
	        	
	        
	       
	}

}
