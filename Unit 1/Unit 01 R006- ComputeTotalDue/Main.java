//put your program here
public class Main{
    public static void main(String[] args){
        double tipPer = 0.18;
        double taxPer = 0.06;
        double totalCost = 7.99 + 12.43 + 11.23;
        double tip = tipPer * totalCost;
        double tax = taxPer * totalCost;
        double totalBill = totalCost + tip + tax;


        System.out.println("The total cost of our food is $" + totalCost + ".");
        System.out.println("The total tip is $" + tip + " and the total tax is $" + tax + ".");
        System.out.println("The total bill is $" + totalBill + " and I think that's a bargain for such high quality food!");


        
    }
}