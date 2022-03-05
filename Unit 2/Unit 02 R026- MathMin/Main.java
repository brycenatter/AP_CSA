//put your code here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        int int1 = ipt.nextInt();
        int int2 = ipt.nextInt();
        int int3 = ipt.nextInt();
        minNum(int1, int2, int3);

        
    }
    public static void minNum(int num1, int num2, int num3){
        int answer = Math.min(num1, num2);
        int res = Math.min(answer, num3);
        System.out.println(res);



    }
}