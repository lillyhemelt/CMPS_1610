/* 
Lilly Hemelt
CMPS 1610
Program 2

Description: this program reads a Celsius temp from the console, converts it to Fahrenheit and prints the result
Celsius I rebuke theeee but fine I guess because Fahrenheit is better tbh
*/

import java.util.Scanner; //import the scanner

public class Program_2 {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            //prompt for celsius temp
            System.out.print("Enter a temperature in Celsius: ");
            double celsius = input.nextDouble();

            //conversion formula (even though Celsius is dumb but fine I guess)
            double fahrenheit = (9.0 / 5) * celsius + 32;

            //display the result in the better degrees
            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " in Celsius.");
    }
}