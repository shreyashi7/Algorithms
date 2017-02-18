package String;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 17, 2017
 */
public class ReverseWordsInString {
	public void reverseWords(char[] s) {
        reverse(s, 0, s.length-1);                  //reverse complete string
        int start = 0;
        int end = -1;
        for(int i =0; i< s.length; i++){            // reverse each word of the string
            if(s[i] == ' '){
                reverse(s, start, i-1);
                start = i+1;
            }
        }
        reverse(s, start, s.length-1);              //reverse single word if there is only one word in the string
        
        
    }
    public void reverse(char[]s , int start, int end){               //reverse function
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
            
        }
    }
    public static void main(String[] args){
    	String n = "The sky is blue";
    	char[]s = n.toCharArray();
    	ReverseWordsInString r = new ReverseWordsInString();
    	r.reverseWords(s);
    	for(int i =0; i<s.length; i++){
    		System.out.println(s[i]);
    	}
        
    }

}
