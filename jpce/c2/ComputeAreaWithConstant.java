package jpce.c2;
import java.util.*;
public class ComputeAreaWithConstant {
    public static void main(String[] args){
        // Declare constant
        final double PI = 3.14159;
        // Initiate scanner
        Scanner _input = new Scanner(System.in);
        // // Testing to change the value of PI
        // PI = 20;
        // Prompt the user to provide the radius
        System.out.print("Please enter the radius of the circle: ");
        double _radius = _input.nextDouble();
        // Compute area
        double _area = PI * _radius * _radius;
        // Display result
        System.out.println("The radius of the circle with radius " + _radius + " is " + _area);
    }
}
