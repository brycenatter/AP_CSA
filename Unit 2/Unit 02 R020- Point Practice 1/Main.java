import java.util.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);

        int w = ipt.nextInt();
        int x = ipt.nextInt();
        int y = ipt.nextInt();
        int z = ipt.nextInt();

        Point point1 = new Point(w, x);
        Point point2 = new Point(y, z);

        point1.translate(5, 7);
        System.out.println(point1);
        

        point2.setLocation(50, 50);
        System.out.println(point2);

        double a = point1.getX() - point2.getX();
        double b = point1.getY() - point2.getY();

        System.out.println(Math.hypot(a, b));


        
      
    }
}