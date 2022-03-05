//write your program here
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);

        int int1 = ipt.nextInt();
        int int2 = ipt.nextInt();
        double dou1 = ipt.nextDouble();
        double dou2 = ipt.nextDouble();

        Integer w = new Integer(int1);
        Integer x = new Integer(int2);

        Double y = new Double(dou1);
        Double z = new Double(dou2);

        System.out.println("The first Integer is equal to " + w.toString());
        System.out.println("The second Integer is equal to " + x.toString());
        System.out.println("The first Double is equal to " + y.toString());
        System.out.println("The second Double is equal to " + z.toString());
        System.out.println("Result of Integer comparison " + w.compareTo(x));








    }
}