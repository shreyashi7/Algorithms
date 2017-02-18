package Misc;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;


public class MissingNumber {
       public static String findMissing(String s){
    	   
    	   StringBuilder sb = new StringBuilder();
    	   int i =0;
    	   String arr[] = s.split(" ");
    	   int arr2[] = new int[arr.length];
    	   for(String a:arr){
    		   arr2[i++] = Integer.parseInt(a);
    	   }
    	   Arrays.sort(arr2);
    	   
    	   int first = arr2[0];
    	   int last = arr2[arr2.length-1];
    	   for(int j = first, index = 0; j<=last && index < arr.length; j++){
    		   if(j != arr2[index]){
    			   sb.append(i+ " ");
    		   }
    		   else index++;
    	   }
    	   return sb.toString();
       }
       
      public static void main(String[] args){
    	  try{
    	  String s = "";
    	  
    	  Scanner sc = new Scanner(new File("C:/Users/hp/Desktop/input.txt"));
    	  FileWriter f = new FileWriter("C:/Users/hp/Desktop/output.txt");
    	  BufferedWriter bw = new BufferedWriter(f);
    	  sc.useDelimiter("/n");
    	  s = sc.nextLine();
    	  while(sc.hasNext()){
    		  s = sc.nextLine();
    		  String fin = findMissing(s);
    		  bw.write(fin);
    		  bw.write("\n");
    	  }
    	  bw.write("/n");
    	  sc.close();
    	  bw.close();
    	  
    	  }
    	  catch (IOException e){
    	  }
      }
}
