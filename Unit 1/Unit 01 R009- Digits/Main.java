// Your code here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner inputObj = new Scanner(System.in);
        int num = inputObj.nextInt();

        int firstDigit = num % 10;
        int secondDigit = ((num - firstDigit) % 100) / 10;
        int thirdDigit = (((num - firstDigit) - ((num - firstDigit) % 100)) % 1000) /100;
        System.out.println(thirdDigit);
        System.out.println(secondDigit);
        System.out.println(firstDigit);
        







    }
}