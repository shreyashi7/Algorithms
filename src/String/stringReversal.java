package String;

public class stringReversal {
     public String reverseString(String s){
    	 char[] tempArr = s.toCharArray();
    	 for(int i=0; i < tempArr.length; i++){
    		 char temp = tempArr[i];
    		 tempArr[i] = tempArr[tempArr.length-1-i];
    		 tempArr[tempArr.length-1-i] = temp;
    		 
    	 }
    	 return new String(tempArr);
     }
     
     public static void main(String[] args){
    	 String a = "hello";
    	 stringReversal ss = new stringReversal();
    	 ss.reverseString(a);
    	 
     }
}
