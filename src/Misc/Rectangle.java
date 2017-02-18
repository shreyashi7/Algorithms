package Misc;

public class Rectangle {
        static boolean doOverLap(Point l1, Point r1, Point l2, Point r2){
        	if(l1.x > r2.x || l2.x > r1.x){                     // if one rectangle is on the left side of other
        		return false;
        	}
        	if(l1.y < r2.y || l2.y < r1.y){                    // if one rectangle is on top of other
        		return false;
        	}
        	return true;
        }
        
        public static void main(String[] args){
        	 Point l1 = new Point(0, 10);
             Point r1 = new Point(10, 0);
             Point l2 = new Point(5, 5);
             Point r2 = new Point(15, 0);
             if (doOverLap(l1, r1, l2, r2))
                 System.out.println("Rectangles Overlap");
             else
                 System.out.println("Rectangles Don't Overlap");
        }
}




class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}