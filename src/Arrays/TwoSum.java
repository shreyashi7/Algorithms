package Arrays;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 14, 2017
 */
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
       if(numbers == null || numbers.length < 2) return res;
      int i = 0, j = numbers.length-1;
      while(i < j){
          int a = numbers[i] +numbers[j];
          if(a == target){
                   res[0] = i+1;
                   res[1] = j+1;
                   break;
           }
           else if(a > target){
               j--;
           }
           else{
               i++;
           }
               
           }
       
       return res;
       
       
   }
	public static void main(String[] args){
		int[] res = {2,3,4};
		int n = 6;
		TwoSum t = new TwoSum();
		int arr[] = t.twoSum(res, n);
		for(int i =0; i< arr.length; i++){
			System.out.println(arr[i]+ " ");
		}
	}

}
