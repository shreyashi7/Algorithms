package Misc;

import java.util.Scanner;
//Your submission should *ONLY* use the following class name
public class Problem
{
  
  public char findK(int n, int k ){
      int digit = k;
      
      String s = "0";
      s = s.replaceAll("0", "01");
      System.out.println(s);

     
      for(int i=1; i<n; i++){
          s = s.replaceAll("0", "01").replaceAll("1","01");
          
      }
      System.out.println(s);

     
      
       char[] f = s.toCharArray();
      
      char a = '\0';
      for(int j=0; j<f.length; j++){
          if (j == digit)
          {
           a = f[j];
          }
      }
      return a;
  }
  
  
  public static void main(String[] args)
  {
	 Problem p = new Problem();

     Scanner stdin = new Scanner(System.in);
     
     int n  = stdin.nextInt();
     
     int k = stdin.nextInt();
    

    char res =  p.findK(n,k);
    System.out.println(res);
     
     stdin.close();
  }

}




