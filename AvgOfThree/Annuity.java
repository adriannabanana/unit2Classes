import java.util.Scanner;

public class Annuity
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Give value of Interest rate: ");
      double i = s.nextDouble();
      System.out.println();
      System.out.print("Give value of number of payments: ");
      double n = s.nextDouble();
      System.out.println();
      System.out.print("Give value of periodic payment: ");
      double pmt = s.nextDouble();
      double ann;
      ann = pmt*(((Math.pow(i+1,n-1)-1)/i)/(Math.pow(i+1,n-1))+1);
      
      System.out.println();
      
      System.out.print("Value of Annuity is: $");
      System.out.format("%.2f%n",ann);
   }
}
