// write your program here
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        String str1 = ipt.nextLine();
        String str2  = ipt.nextLine();
        int num  = ipt.nextInt();
        makeNewWord(str1, str2, num);

    

    }
    public static void makeNewWord(String str1, String str2, int num){
        String word = str1.substring(0, num) + str2.substring(num);
        System.out.println(word);




    }
}