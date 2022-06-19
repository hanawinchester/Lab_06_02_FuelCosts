import java.util.Scanner;
public class Main
{
    public static void main(String[] args)

    {
        double gallons = 0;
        double efficiency;
        double price;
        double hundredCost;
        double distance;
        String trash;

        Scanner in = new Scanner (System.in);
        System.out.print("Enter the number of gallons of gas in your tank: ");
        if (in.hasNextDouble())
        {
            gallons = in.nextDouble();
            in.nextLine();
        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number of gallons. You entered: " + trash);
        }

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble())
        {
            efficiency = in.nextDouble();
            in.nextLine();
            distance = efficiency * gallons;
            String formattedDistance = String.format("%.2f", distance);
            System.out.println("You can go " + formattedDistance + " miles with " + gallons + " gallons of gas.");

        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid efficiency number in miles per gallon. You entered: " + trash);
        }

        System.out.print("Enter the price of gas per gallon: $");
        if (in.hasNextDouble())
        {
            price = in.nextDouble();
            in.nextLine();
            hundredCost = price * 100;
            String formattedCost = String.format("%.2f", hundredCost);
            System.out.println("The cost per 100 miles is: $" + formattedCost);

        }
        else {
            trash = in.nextLine();
            System.out.println("Must enter a valid price. You entered: " + trash);
        }
    }
}