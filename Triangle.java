import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("A:");
            double a = sc.nextDouble();
            System.out.println("B:");
            double b = sc.nextDouble();
            System.out.println("C:");
            double c = sc.nextDouble();
            if((a<=0) || (b<=0) || (c<=0))
            {
                System.out.println("this is not a triangle!");
            }
            else if((a==b) && (b==c))
            {
                System.out.println("this is an equilateral triangle!");
            }
            else if((a==b) || (b==c) || (c==a))
            {
                System.out.println("this is an isosceles triangle!");
            }
            else if((a!=b) && (b!=c))
            {
                System.out.println("this is an scalene triangle!");
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input! Try again");
        }
    }
}