//put your code here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        int int1 = ipt.nextInt();
        int int2 = ipt.nextInt();
        dice();
        twoDice();
        randomInt(int1, int2);
    }
    public static void dice(){
       System.out.println("The result of a role of one dice is: " + ((int)(Math.random()*6) + 1));

    }
    public static void twoDice(){
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        System.out.println("The result of a role of two dice is: " + (die1 + die2));

    }
    public static void randomInt(int num1, int num2){
        int range = num2 - num1 +1;
        int ranNum = (int)(Math.random()*range) + num1;
        System.out.println("The random number between " + num1 + " and " + num2 + " is: " + ranNum);


    }
}