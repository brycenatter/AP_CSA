//create your program here
public class ComputePay {

    public static void main(String[] args) {

        // Calculate pay at work based on hours worked each day
        int hoursWorked = 4 + 5 + 8 + 4;
        double hourlyWage = 8.75;
        double taxRate = 0.20;

        System.out.println("My total hours worked: " + hoursWorked);


        System.out.println("My hourly salary: $" + hourlyWage);
        

        System.out.println("My total pay: $" + hoursWorked * hourlyWage);

        
        System.out.println("My taxes owed: $" + hoursWorked * hourlyWage * taxRate); 


    }

}