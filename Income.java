import java.util.Scanner;
public class SimpleTaxbva
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter income: ");
        double income = sc.nextDouble();
        double tax = 0;
        double b1 = 500000;
        double b2 = 1000000;
        if(income == b1 || income == b1+1 || income == b2 || income == b2+1)
        {
            System.out.println("Boundary Value Detected!");
        }
        if(income<=500000)
        {
            tax = 0;
        }
        else if(income>500000 && income <=1000000)
        {
            tax = income * 0.20;
        }
        else
        {
            tax = income * 0.30;
        }
        System.out.println("Tax = "+tax);
    }

}
