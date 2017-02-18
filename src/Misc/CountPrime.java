package Misc;
/**
 * Created by Shreyashi Sharma
 *
 * Feb 14, 2017
 */
import java.util.*;
public class CountPrime {
	public int countPrimes(int n) {
        int count = 0;
        boolean not[] = new boolean[n];
        for(int i = 2; i < n; i++){
            if(not[i] == false){
                count++;
            }
            for(int j = 2; i*j < n; j++){
                not[i*j] = true;
                
            }
                
            }
        
        
        return count;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		CountPrime c = new CountPrime();
		int res = c.countPrimes(n);
		System.out.println(res);
	}

}
