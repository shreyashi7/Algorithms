package Misc;
import java.util.*;
public class Sliding {
	    public int[] maxSlidingWindow(int[] nums, int k) {
	        if(nums == null || k == 0) return new int[0];
	        
	        int n = nums.length;
	        int r[] = new int[n-k+1];
	        int ri = 0;
	        Deque<Integer> q = new ArrayDeque<>();
	        for(int i =0; i< nums.length; i++){
	            while(!q.isEmpty() && q.peek() < i-k+1){          // remove all elements not falling in range i-k+1
	                q.poll();
	            }
	            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]){     // remove all elements smaller than nums[i]
	                q.pollLast();
	            }
	            q.offer(i);                                         // return remaining elements
	            if(i >= k-1){
	                r[ri++] = nums[q.peek()];
	            }
	        }
	        return r;
	    }
	}

