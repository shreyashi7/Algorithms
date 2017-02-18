package Arrays;

public class rotateArray {
	public int  findNumber(int arr[], int low, int high, int key){
		if (low>high) return -1;
		
		int mid = (low+high)/2;
		if(arr[mid] == key) return mid;
		
		if(arr[low]<arr[mid]){
			if(arr[key] > arr[low] && arr[key] < arr[mid]){
				findNumber(arr,low,mid,key);
			}
			
			return findNumber(arr,low,mid,key);
		}
		
		if(arr[key] < arr[high] && arr[key] > arr[mid+1]){
				findNumber(arr,mid+1,high,key);
			}
		return findNumber(arr,mid+1,high,key);

		
		
	}
	
	public static void main(String[] args){
		int arr[]  = {1,2,3,4,5,6};
		rotateArray r = new rotateArray();
		int res = r.findNumber(arr, 1, 5, 2);
		System.out.println(res);

}
}
