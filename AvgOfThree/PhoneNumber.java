import java.util.Scanner;

public class PhoneNumber
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a ten-digit phone number: ");
        String phoneNumber = s.next();
        System.out.println();
        String betterNumber = "(";
        betterNumber += phoneNumber.substring(0,3);
        betterNumber += ") ";
        betterNumber += phoneNumber.substring(3,6);
        betterNumber += "-";
        betterNumber += phoneNumber.substring(6,9);
        System.out.print("More readible phone number: ");
        System.out.print(betterNumber);
    }
}
