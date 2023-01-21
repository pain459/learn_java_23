package jpce.c2;
import java.util.*;
public class SimpleInterestWithInput {
    public static void main(String[] args){
        // Declaring scanners
        Scanner _value = new Scanner(System.in);

        // Getting inputs.
        System.out.print("Enter the principle amount: ");
        double _principle = _value.nextDouble();
        System.out.print("Enter the tenure in years: ");
        double _tenure = _value.nextDouble();
        System.out.print("Enter the ROI given by bank: ");
        double _roi = _value.nextDouble();

        // Calculate total amount using simple interest formula.
        double _total_payable = _principle * (1 + (_roi * _tenure));

        // Print the result.
        System.out.println("Calulated net amount is: " + _total_payable);
    }
}
