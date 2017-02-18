package Misc;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 9, 2017
 */
import java.util.*;
public class Test {
	public int[] maxSlidingWindow(int[] nums, int k){
		if(nums == null || k==0) return new int[0];
		int n = nums.length;
		int r[]= new int[n-k+1];
		int ri = 0;
		Deque<Integer> q = new ArrayDeque<>();
		for(int i= 0 ;i< nums.length; i++){
			while(!q.isEmpty() && q.peek()<i-k+1){
			q.poll();
			}
			while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
				q.pollLast();
				
			}
			q.offer(i);
			
			if(i <= k-1){
				r[ri++] = nums[q.peek()];
			}
		}
		return r;
	}

}
