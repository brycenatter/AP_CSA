//Bryce Natter
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int sum = num1 + num2 + num3 + num4;
        int avgNoCasting = sum / 4;
        double avgLateCasting = (int)(sum / 4);
        double avgCorrectCasting = (double)sum / 4;


        System.out.println("No casting is used.  The average printed is an int: " + avgNoCasting);

        System.out.println("The casting occurs too late and the double printed is inaccurate: " + avgLateCasting);
        System.out.println("Casting is used correctly and a correct average is printed: " + avgCorrectCasting);












    }
}
