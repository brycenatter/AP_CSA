import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        String word1 = ipt.nextLine().toLowerCase().replaceAll("\\s", "");
        String word2 = ipt.nextLine().toLowerCase().replaceAll("\\s", "");





        System.out.println(word1.equals(word2));
  }
}