package Arrays;
import java.util.Scanner;

public class MissingNumber {
	
       public int findMissing(int arr[], int n){
    	   
               int sum = (n*(n+1))/2;
               for(int i= 0; i<n; i++){
            	   sum = sum-arr[i];
               }
               
    	   return sum;
       }
       
       public static void main(String[] args){
    	   Scanner s = new Scanner(System.in);
    	   System.out.println("Enter the size of array- ");
    	   int n =  s.nextInt();
    	   
    	   int arr[] = new int[n];

    	   System.out.println("Enter the elements of array- ");
    	   for(int i= 0; i< n-1; i++){
    		   arr[i] = s.nextInt();
    	   }
    	   
    	   MissingNumber m = new MissingNumber();
    	   int  missing = m.findMissing(arr, n);
           System.out.println("The missing number is: "+missing);
       }
       
       
       
}
