package Arrays;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 14, 2017
 */
import java.util.*;
public class FirstUniqueCharacter {
	public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) return -1;
        int count[] = new int[26];
        for(int i =0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < s.length(); j++){
            if(count[s.charAt(j) - 'a'] == 1)
            {
                    return j;
            }
                
        }
        
        return -1;
        
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		FirstUniqueCharacter f = new FirstUniqueCharacter();
		int res = f.firstUniqChar(s);
		System.out.println(res);
	}

}
