package Sorting;

public class quickSort {

	private int partition(int []A,int p,int r){
		
		int temp =0;
		int pivot = A[r];
		int i=p-1;
		//System.out.println("before partition");
		for(int j=p; j<r; j++){
			if(A[j] <= pivot){
				i = i+1;
				A[temp] = A[i];
				A[i] = A[j];
				A[j] = A[temp];
			}
		   }
				A[temp] = A[i+1];
				A[i+1] = A[r];
				A[r] = A[temp];
		
			//System.out.println("after partition");
		
		return (i+1);
	}
	
	public void qsort(int []A, int p,int r){
		if(p<r){
			
			//System.out.println("before partition");
			int q = partition(A,p,r);
			//System.out.println("before partition");
			qsort(A,p,q-1);
			qsort(A,q+1,r);
		}
	}
	
	public static void main(String[] args){
		
		try{
		int A[] = {5,4,7,2,1,9,3,6,10,8};
		int p = A[0];
		int n= A.length;
		System.out.println("The length is " +n);
		quickSort s = new quickSort();
		//System.out.println("before partition");
		s.qsort(A,0,n-1);
		System.out.println("The sorted elements are ");
		for(int i=0;i<n;i++){
			System.out.println(A[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{}
		
	}
}
