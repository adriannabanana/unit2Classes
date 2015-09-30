import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Length of rectangle: ");
        double length = s.nextDouble();
        System.out.println();
        System.out.print("Width of rectangle: ");
        double width = s.nextDouble();
        System.out.println();
        double area;
        area = length*width;
        double perimeter;
        perimeter = length*2 + width*2;
        double diagonal;
        diagonal = Math.pow(Math.pow(length,2)+Math.pow(width,2),.5);
        
        System.out.println();
        System.out.print("Area: ");
        System.out.printf("%.2f%n",area);
        System.out.print("Perimeter: ");
        System.out.printf("%.2f%n",perimeter);
        System.out.print("Diagonal: ");
        System.out.printf("%.2f%n",diagonal);
    }
}
