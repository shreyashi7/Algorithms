package Misc;

import java.util.Arrays;

/**
 * Created by Shreyashi Sharma
 *
 * Feb 8, 2017
 */
public class MinSteps {
	
	public int[] minSteps(String s){
		
		String [] input = s.split("\n");
		
		
			
			int arr[] = new int[input.length];
			
			for(int i =0 ; i<arr.length; i++){
				arr[i] = Integer.parseInt(input[i]);
			}
		
			int count[] = new int[arr.length];
			int total[] = new int[arr.length];
			for(int i =0; i<total.length; i++){
	            count[i] = 0;
			}
			
				for(int i = 0; i < arr.length; i++){
	                  while(arr[i] != 0){
	                       if(arr[i]%2==0)
	                       {
	                         arr[i]/=2;
	                       }
	                       else{
	                         arr[i]--;
	                       }
	                      count[i]++;    
	                      }
	                  }
	                   return count;
		}


	
	public static void main(String[] args){
		String s = "2\n5\n3";
		MinSteps m = new MinSteps();
		
		int res[] = m.minSteps(s);
		System.out.println(Arrays.toString(res));
	}

}
