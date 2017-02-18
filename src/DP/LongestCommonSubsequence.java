package DP;

public class LongestCommonSubsequence {
	
public int lcs(char s[],char p[],int len1, int len2){
        
        if(len1 == s.length || len2 == p.length){
            return 0;
        }
        if(s[len1] == p[len2]){
            return 1 + lcs(s,p,len1+1,len2+1);
        }
        else{
            return Math.max(lcs(s,p,len1+1,len2),lcs(s,p,len1,len2+1));
        }
    }

	public int commonSubsequence(char[] s, char[] p){
		
		int T[][] = new int[s.length+1][p.length+1];
		
		int max =0;
		for(int i= 1;i <T.length; i++){
			for(int j=1; j<T[i].length; j++){
				if(s[i-1] == p[j-1]){
					T[i][j] = T[i-1][j-1]+1;
				}
				else{
					T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
				}
				
				if(T[i][j] > max) max = T[i][j];
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args){
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        
        int result = lcs.commonSubsequence(str1.toCharArray(), str2.toCharArray());
        System.out.print(result);
    
	}

}
