
// write your program here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        String str = ipt.nextLine();
        int start  = ipt.nextInt();
        int end  = ipt.nextInt();

        System.out.println("The substring of " + str + " from " + start +" to " + end +" inclusive is " + str.substring(start, end+1));


        


    }
}