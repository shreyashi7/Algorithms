package String;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 14, 2017
 */
public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String str) {
        int n = str.length();
        for(int i = n/2; i>=1; i--){                           //start from the mid length to check
            if(n%i == 0){                                     //check if the length of the substring is a divisor of the total length
                int m = n/i;
                String sub = str.substring(0,i);             //if it is a divisor take a string buffer and keep on appending the substring
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j<m ;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(str)) return true;    // at the end the length of appended string will be equal to the length of complete string
            } 
        }
        return false;
        
    }
	public static void main(String[] args){
		String str = "abcabcabcabc";
		RepeatedSubstringPattern r = new RepeatedSubstringPattern();
		boolean res = r.repeatedSubstringPattern(str);
		System.out.println(res);
	}

}
