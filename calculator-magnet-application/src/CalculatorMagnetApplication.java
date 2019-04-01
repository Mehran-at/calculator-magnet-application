//Derek wants to play around with his new programming abilities. He’s decided to create his own calculator magnet to place it on his fridge’s door.
//Develop a code that asks for two numbers and says their sum.

//Derek has decided to improve his magnet calculator with an action that can find out the square (power two) of a given number.
//      a. Define an action that calculates the square (power two) of a given number.
//      b. Develop a code that asks for two numbers, uses the previous action and says the result.
import java.util.Scanner;

public class CalculatorMagnetApplication {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Square square = new Square();
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int sum = manager.getSum(one, two);
        System.out.println("The sum of your two numbers is: " + sum);
        System.out.println("And the square of that number is: " + square.getSquare(sum));
    }
}