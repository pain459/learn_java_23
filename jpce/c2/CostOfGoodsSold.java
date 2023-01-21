package jpce.c2;
import java.util.*;
public class CostOfGoodsSold {
    public static void main(String[] args){
        // Initiation a scanner.
        Scanner _input = new Scanner(System.in);
        // Collecting data points for calculation.
        System.out.println("This program will calculate the COGS (Cost of goods sold.)");
        System.out.print("Enter the Beginning inventory value: ");
        double _beginning_value = _input.nextDouble();
        System.out.print("Enter the Purchases during the period: ");
        double _purchases_during_period = _input.nextDouble();
        System.out.print("Enter the Ending inventory value: ");
        double _ending_inventory = _input.nextDouble();
        // calculating COGS
        double _cogs = _beginning_value + _purchases_during_period - _ending_inventory;
        // Printing the result.
        System.out.println("Calculated COGS is: " + _cogs);
    }    
}
