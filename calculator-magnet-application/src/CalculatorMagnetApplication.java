import java.util.Scanner;

public class CalculatorMagnetApplication {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        System.out.println(manager.getSum(one, two));

    }
}