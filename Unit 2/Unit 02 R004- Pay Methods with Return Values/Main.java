import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        double rate = input.nextDouble();
        double pay = calculatePay(hours, rate);

        System.out.println("Your total pay for today is $" + pay);
    }

    public static double calculatePay(int hours, double rate){
        double pay = hours * rate;
        return pay;
    }
}