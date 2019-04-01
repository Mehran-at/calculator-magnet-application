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