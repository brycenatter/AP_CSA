import java.util.*;
import java.awt.*;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);

        System.out.println("Enter 8 intergers used to create 4 points:");

        int x1 = ipt.nextInt();
        int y1 = ipt.nextInt();
        int x2 = ipt.nextInt();
        int y2 = ipt.nextInt();
        int x3 = ipt.nextInt();
        int y3 = ipt.nextInt();
        int x4 = ipt.nextInt();
        int y4 = ipt.nextInt();

        System.out.println("Enter an interger to repersent the diameter of the roadtrip:");

        int diameter = ipt.nextInt();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);
        Point point4 = new Point(x4, y4);

        //printPoints(point1, point2, point3, point4);
        System.out.println();

        //System.out.println(roadTrip(diameter));
        
        System.out.println("Distance from first point to the second point: " + calculateDistance(point1, point2));
        System.out.println("Distance from second point to the third point: " + calculateDistance(point2, point3));
        System.out.println("Distance from thrid point to the fourth point: " + calculateDistance(point3, point4));

        System.out.println("Dear Princess Luna, here are the details for the total distance of your 4-stop tour of Equestria. The total distance traveled once you return to your stop one is " + totalTrip(point1, point2, point3, point4));


        
        



    }

    public static void printPoints(Point p1, Point p2, Point p3, Point p4){
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }

    public static double roadTrip(int dia){
        
        return (dia)*(Math.PI);
    }

    public static double calculateDistance(Point point1, Point point2){
        double a = point1.getX() - point2.getX();
        double b = point1.getY() - point2.getY();
        double distance = Math.hypot(a, b);
        return distance;
    }

    public static double totalTrip(Point point1, Point point2, Point point3, Point point4){
        double totalDistance = calculateDistance(point1, point2) + calculateDistance(point2, point3) + calculateDistance(point3, point4);

        return totalDistance;
    }
}