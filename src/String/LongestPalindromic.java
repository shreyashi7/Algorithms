package String;

public class LongestPalindromic {
	StringBuilder sb = new StringBuilder("");
	public String longestPalindromicSubstring(String s){
		if(s.length() <= 1) return s;
		
		for(int i =0; i < s.length(); i++){
			longest(s, sb, i, i);                                                          // odd part
			longest(s, sb, i, i+1);                                                        // even part
		}
		return sb.toString();
	}
	
	public void longest(String s, StringBuilder sb, int i, int j){
		while(i >= 0 && j < s.length()){
			if(s.charAt(i) == s.charAt(j)){
				if(j - i + 1 > sb.length()){
					sb.delete(0, sb.length());
					sb.append(s.substring(i, j+1));
				}
				i--;
				j++;
			}
			else{
				break;
			}
		}
		
		
		
	}
	public static void main(String [] args){
		String s = "dababac";
		LongestPalindromic l = new LongestPalindromic();
		String res = l.longestPalindromicSubstring(s);
		System.out.println(res);
	}

}
