// write your program here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        String str = ipt.next();
        System.out.println("The first 3 letters of " + str + " is " + str.substring(0,3) + ".");


    }
}