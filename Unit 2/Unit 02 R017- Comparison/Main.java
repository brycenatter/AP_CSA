import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        String word1 = ipt.nextLine().toLowerCase();
        String word2 = ipt.nextLine().toLowerCase();

        System.out.println(word1.equals(word2));
  }
}