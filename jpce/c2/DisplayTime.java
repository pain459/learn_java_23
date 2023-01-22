package jpce.c2;
import java.util.*;
public class DisplayTime {
    public static void main(String[] args){
        // Greeting message
        System.out.println("Welcome to time coverter. \nThis program will convert seconds to minutes:seconds");
        // Initiate scanner
        Scanner _input = new Scanner(System.in);
        // Take input
        System.out.print("Please enter the value in seconds: ");
        int _seconds = _input.nextInt();
        // Convert into minutes and seconds
        int _minutes = _seconds / 60; // Find minutes in seconds
        int _remaining_seconds = _seconds % 60;
        // Print result
        System.out.println(_seconds + " converted to " + _minutes + " minutes and " + _remaining_seconds + " seconds.");
    }
}
