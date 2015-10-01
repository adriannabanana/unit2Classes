import java.util.Scanner;

public class ChangeGiva
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.print("Amount due: ");
        float due = s.nextFloat();
        System.out.print("Amount received: ");
        float received = s.nextFloat();
        System.out.println();
        float actualChange = received - due;
        int change = (int) (actualChange*100.0);
        
        int dollars = change/100;
        int dollarRemainder = change%100;
        int quarters = dollarRemainder/25;
        int quarterRemainder = dollarRemainder%25;
        int dimes = quarterRemainder/10;
        int dimeRemainder = quarterRemainder%10;
        int nickels = dimeRemainder/5;
        int nickelRemainder = dimeRemainder%5;
        int pennies = nickelRemainder;
        
        System.out.println();
        System.out.print("Dollars of change: ");
        System.out.print(dollars);
        System.out.println();
        System.out.print("Quarters of change: ");
        System.out.print(quarters);
        System.out.println();
        System.out.print("Dimes of change: ");
        System.out.print(dimes);
        System.out.println();
        System.out.print("Nickels of change: ");
        System.out.print(nickels);
        System.out.println();
        System.out.print("Pennies of change: ");
        System.out.print(pennies);
    }
}
        
                
            