package Arrays;
public class largestSumSubArray {
       int findSum(int arr[]){
    	   int max_sum = Integer.MIN_VALUE;
    	   int max_current = 0;
    	   for(int i=0; i<arr.length;i++){
    		   
    	       max_current = max_current + arr[i];
    		   if(max_sum < max_current){
    			   max_sum = max_current;
    		   }
    		   if(max_current < 0) max_current = 0;
    	   }
    	   return max_sum;
       }
       
       public static void main(String[] args){
    	  int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    	  largestSumSubArray res = new largestSumSubArray();
    	  int result = res.findSum(arr);
    	  System.out.println("The largest sum is: "+result);
       }
}
