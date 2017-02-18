package Arrays;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 17, 2017
 */
import java.util.*;
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);                                        //sort the array
        ArrayList<List<Integer>> res = new ArrayList<>();     
        for(int i = 0; i < nums.length-2; i++){                   // first loop for iteration uptil second last value
            if(i > 0 && nums[i] == nums[i-1]){                   // avoid duplicates therefore skip it
                continue;
            }
            int j = i+1, k = nums.length-1;
            int sum = -nums[i];
            while(j < k){
                if(nums[j] + nums[k] == sum){                    // if sum turns out to be zero then add to list
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;          //avoid duplicate and skip
                    while(j < k && nums[k] == nums[k+1]) k--;          //avoid duplicate and skip
                }
                else if(nums[j] + nums[k] > sum){                  //if sum doesn't fall in range
                    k--;
                }
                else{
                    j++;
                }
                
            }
        }
        return res;

    }
	public static void main(String[] args){
		int nums[] = {-1,2,1,0,-1,4};
		ThreeSum t = new ThreeSum();
		ArrayList<List<Integer>> res = (ArrayList<List<Integer>>) t.threeSum(nums);
		System.out.println(res);
	}

}
