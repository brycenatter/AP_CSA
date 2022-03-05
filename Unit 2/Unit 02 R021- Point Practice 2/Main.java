import java.util.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);

        int w = ipt.nextInt();
        int x = ipt.nextInt();
        int y = ipt.nextInt();
        int z = ipt.nextInt();
        int q = ipt.nextInt();

        Point point1 = new Point(w, x);
        Point point2 = new Point(y, z);

        point1 = manipulatePoint(point1, q);

    
        System.out.println(point1);
        System.out.println(point1 == point2);


        
      
    }

    public static Point manipulatePoint(Point pnt, int a){
        pnt.translate(a, a);
        return pnt;




    }
}