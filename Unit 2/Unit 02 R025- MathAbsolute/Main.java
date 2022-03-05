//put your code here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        int int1 = ipt.nextInt();
        int int2 = ipt.nextInt();
        double dou1 = ipt.nextDouble();
        double dou2 = ipt.nextDouble();
        absAddInt(int1, int2);
        absAdd(dou1, dou2);
    }
    public static void absAddInt(int num1, int num2){
        int answer = Math.abs(num1) + Math.abs(num2);
        System.out.println(answer);
        
    }
    public static void absAdd(double num1, double num2){
        double answer = Math.abs(num1) + Math.abs(num2);
        System.out.println(answer);
        
    }
}