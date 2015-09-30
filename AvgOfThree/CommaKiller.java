import java.util.Scanner;

public class CommaKiller
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String number = s.next();
        System.out.println();
        int commaIndex = number.indexOf(",");
        String commalessNumber = number.substring(0,commaIndex);
        commalessNumber += number.substring(commaIndex+1,number.length());
        
        System.out.println();
        System.out.print("Integer without comma: ");
        System.out.print(commalessNumber);
    }
}

      
        