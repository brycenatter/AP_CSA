//put your code here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        int int1 = ipt.nextInt();
        int int2 = ipt.nextInt();
        runOps(int1, int2);
    }
    public static void runOps(int num1, int num2){
        System.out.println(Math.pow(num1, num2));
        System.out.println(Math.pow(num2, num1));
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.sqrt(num2));


    }
}