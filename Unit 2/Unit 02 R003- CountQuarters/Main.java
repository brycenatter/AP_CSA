import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = input.nextInt();
        countQuarters(total);


    }
    public static void countQuarters(int total){
        int cents = total % 1000 % 100;
        int quarters = cents / 25;

        System.out.println("There are " + quarters + " quarters in the integer " + total);
    }
}