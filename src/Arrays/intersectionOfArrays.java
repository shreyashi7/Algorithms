package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class intersectionOfArrays {
        public int[] intersection(int[] nums1, int[] nums2){
        	
        	//Method 1
        	/*HashSet<Integer> s1 = new HashSet<Integer>();
        	for(int i : nums1){
        		s1.add(i);
        	}
        	
        	HashSet<Integer> s2 = new HashSet<Integer>();
        	for(int i :nums2){
        		if(s1.contains(i)){
        			s2.add(i);
        		}
        	}
        	
        	int res[] = new int[s2.size()];
        	int i=0;
        	for(int n:s2){
        		res[i++] =n;
        	}*/
        	//Method 2 when arrays are sorted and length of one array is less than the other
        	Arrays.sort(nums1);
        	Arrays.sort(nums2);
        	ArrayList <Integer> list = new ArrayList<Integer>();
        	int p1=0;
        	int p2=0;
        	while(p1<nums1.length && p2<nums2.length){
        		if(nums1[p1] < nums2[p2]){
        			p1++;
        		}
        		else if(nums1[p1] > nums2[p2]){
        			p2++;
        		}
        		else{
        			list.add(nums1[p1]);
        			p1++;
        			p2++;
        			
        		}
        		}
        		
        		int res[] = new int[list.size()];
        		int i=0;
        		while(i < list.size()){
        			res[i] = list.get(i);
        			i++;
        		}
        	
        	
        		return res;
        }
        
        
        
        public static void main(String[] args){
        	intersectionOfArrays i = new intersectionOfArrays();
        	int[] A ={1,2,2,1};
        	int[] B ={2,2};
        	int result[] = i.intersection(A,B);
        	for(int k=0; k<result.length;k++){
        		System.out.println(result[k]);
        	}
        }
}
