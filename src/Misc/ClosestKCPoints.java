package Misc;
import java.util.*;

public class ClosestKCPoints {
	class Cpoint{
		public double x;
		public double y;
	}
	public static Cpoint[] closestK(Cpoint[] myList, int k){                                //create a map for the array of points
		Map<Double, Cpoint> cPointMap = createMap(myList);
		return getKClosestPoints(cPointMap, k);
	}
	public static Map<Double, Cpoint> createMap(Cpoint[] myList){
		Map<Double, Cpoint> cPointMap = new TreeMap<>();
		
		for(int i=0; i < myList.length; i++){
			double x = myList[i].x;
			double y = myList[i].y;
			
			double distanceFromOrigin = Math.sqrt(x*x + y*y);              //finding the square root distance for closest point
			cPointMap.put(distanceFromOrigin, myList[i]);                // add distance of each point corresponding to that point in map
		}
		
		return cPointMap;
	}
	
	public static Cpoint[] getKClosestPoints(Map<Double, Cpoint> CPointMap, int k){
		int count =0;
		Cpoint cpoint[] = new Cpoint[k];
		for(Map.Entry<Double, Cpoint> entry: CPointMap.entrySet()){        //entrySet here gives the complete view of the map 
			if(count < k){                                                 // if your count is less than the required number of neighbors add the values to the final array 
				cpoint[count++] = entry.getValue();  
			}
			
		}
		
		return cpoint;
		
		
		
	}

}
