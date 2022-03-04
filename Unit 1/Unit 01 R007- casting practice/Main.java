//put your program here
//Bryce Natter
public class Main{
    public static void main(String[] args){

        double test1 = 3.3;
        double test2 = 2.3;
        double test3 = 4.0;
        double sumGrades = test1 + test2 + test3;

        System.out.println("Your GPA on a 4.0 scale is: " + ((test1 + test2 + test3) / 3));
        
        System.out.println("Your GPA, with test3 counted as a double weight is: " + ((test1 + test2 + test3 * 2) / 4));
        
        System.out.println("Your GPA, with the new rules, is: " + ((test1 + (int) test2 + test3) / 3));

        System.out.println("Your GPA, with the system glitch, is: " + (int) ((test1 + test2 + test3) / 3));





    }
}