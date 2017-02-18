package HashMap;
import java.util.*;
import java.io.*;
public class phoneDirectory {
	
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        HashMap<String, Integer> map = new HashMap<String,Integer>();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            map.put(name, phone);
	            // Write code here
	        }
	       
	        while(in.hasNext()){
	            String s = in.next();
	            int i=0;
	            if(map.get(s)!=null){
	                System.out.println(s+"="+map.get(s));
	            }
	            else{
	                System.out.println("Not found");

	            }
	            // Write code here
	        }
	        in.close();
	    }
	}


