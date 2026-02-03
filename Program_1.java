/* Lilly Hemelt
CMPS 1610 - Program 1

Purpose: demonstrates the basic output and interger manipulation.

Notes: this program displays 3 messages, prints the value of count, updates count by adding 300 and prints the new value */

public class Program_1 {
    public static void main(String[] args) {
        //display required messages
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Southeastern & Lion Up");
        System.out.println("Programming is fun");

        //variable demonstration
        int Count = 100; //initial value
        System.out.println("Count = " + Count);
        Count += 300;  //update count
        System.out.println("Count = " + Count);
    }
}