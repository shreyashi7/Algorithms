package DP;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 8, 2017
 */
public class SubsetSum {
       public boolean subset(int []arr, int total){
    	   boolean T[][] = new boolean[arr.length+1][total+1];
    	   for(int i =0; i<= arr.length; i++){
    		   T[i][0] = true;
    	   }
    	   for(int i =1; i<arr.length; i++){
    		   for(int j =1; j<total; j++){
    			   if(j - arr[i-1] < 0){
    				   T[i][j] = T[i-1][j];
    			   }
    			   else{
    				   T[i][j] = T[i-1][j] || T[i-1][j - arr[i-1]];
    			   }
    		   }
    	   }
    	   return T[arr.length][total];
       }
       
       public static void main(String[] args){
    	   int arr[] = {2,3,7,8,10};
    	   SubsetSum sb = new SubsetSum();
    	   boolean result = sb.subset(arr, 10);
    	   System.out.println(result);
       }
}
