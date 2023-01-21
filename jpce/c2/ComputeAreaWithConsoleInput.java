package jpce.c2;
import java.util.Scanner;

class ComputeAreaWithConsoleInput
{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number for radius: ");
            double radius = input.nextDouble();

            double area = radius * radius * 3.14159;
            System.out.println("Calculated area is for radius " + radius + " is " + area);
        }
    }
}