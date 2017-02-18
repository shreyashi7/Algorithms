package Arrays;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 14, 2017
 */
import java.util.*;
public class ThirdMax {
	public int findThirdMax(int[] nums){
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	Set<Integer> set = new HashSet<>();
	for(int i : nums){
		if(!set.contains(i)){
			pq.offer(i);
			set.add(i);
			if(pq.size() > 3){
				set.remove(pq.poll());
			}
		}
	}
	if(pq.size() == 2) pq.poll();
		
	return pq.peek();
	}
	
	public static void main(String[] args){
		int nums[] = {3,2,1};
		ThirdMax t = new ThirdMax();
		int res = t.findThirdMax(nums);
		System.out.println(res);
	}

}

