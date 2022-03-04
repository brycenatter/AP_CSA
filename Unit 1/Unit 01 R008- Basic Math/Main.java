// Your code here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in); 
        int input1 = scannerObj.nextInt();
        int input2 = scannerObj.nextInt();
        int input3 = scannerObj.nextInt();

        int total = (input1 + input2 + input3);
        double average = total / 3.0;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);


    }
}