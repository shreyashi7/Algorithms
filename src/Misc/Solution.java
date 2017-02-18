package Misc;

public class Solution {
	
	public static int printSum(String s){
	      int sum=0,space=0;
	      String ar[] = s.split("\n");
	      for(int i=ar.length-1;i>=0;i--){
	          String line = ar[i];
	          if(line.contains(".gif")||line.contains(".jpeg")||line.contains(".png")){
	              space=line.length()-line.trim().length();
	              

	          }
	          if(space>line.length()-line.trim().length()){
	              sum+=line.trim().length()+1;
	              space--;
	              
	          }

	      }

	 return sum;

	   }

	   public static void main(String[] args) {
	       String S="dir1\n dir12\n  picture.jpeg\ndir2\n file2.gif";

	       System.out.println(printSum(S));


	   }
	}



