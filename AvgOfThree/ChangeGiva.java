import java.util.Scanner;

public class ChangeGiva
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.print("Amount due: ");
        float due = s.nextFloat();
        due *= 100;
        System.out.print("Amount received: ");
        float received = s.nextFloat();
        received *= 100;
        System.out.println();
        if (received > due)
        {
            int dollarChange = received % due;
            