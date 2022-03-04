//put your program here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Main p = new Main();
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int age = input.nextInt();
        p.printNameAndAge (name, age);
    }
    public void printNameAndAge(String name, int age){
        System.out.println(name + " is " + age + " years old.");


    }


}