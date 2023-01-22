package jpce.c2;
import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args){
        // Initiate scanner
        Scanner _input = new Scanner(System.in);
        // Take inputs from the user
        System.out.print("Enter a degree in Fahrenheit: ");
        double _fahrenheit = _input.nextDouble();
        // Conversion from Fahrenheit to Celsius
        double _celsius = (5.0 / 9) * (_fahrenheit - 32);
        System.out.println("Fahrenheit " + _fahrenheit + " is " + _celsius + " celsius.");
    }
}
