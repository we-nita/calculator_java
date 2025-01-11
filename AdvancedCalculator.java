import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Advanced Operations:");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Exponentiation (^)");
        System.out.println("7. Square Root (√)");
        System.out.println("8. Factorial (!)");
        System.out.println("9. Trigonometry (sin, cos, tan)");

        System.out.print("Enter choice (5/6/7/8/9): ");
        int choice = scanner.nextInt();

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();

        switch (choice) {
            case 5 -> {
                System.out.print("Enter second number for modulus: ");
                double mod = scanner.nextDouble();
                System.out.println("Result: " + num + " % " + mod + " = " + (num % mod));
            }
            case 6 -> {
                System.out.print("Enter exponent: ");
                double exp = scanner.nextDouble();
                System.out.println("Result: " + num + " ^ " + exp + " = " + Math.pow(num, exp));
            }
            case 7 -> {
                if (num >= 0) {
                    System.out.println("Result: √" + num + " = " + Math.sqrt(num));
                } else {
                    System.out.println("Error: Square root of a negative number is not defined!");
                }
            }
            case 8 -> {
                if (num >= 0 && num == Math.floor(num)) {
                    System.out.println("Result: " + (int) num + "! = " + factorial((int) num));
                } else {
                    System.out.println("Error: Factorial is only defined for non-negative integers.");
                }
            }
            case 9 -> {
                System.out.println("sin(" + num + ") = " + Math.sin(Math.toRadians(num)));
                System.out.println("cos(" + num + ") = " + Math.cos(Math.toRadians(num)));
                System.out.println("tan(" + num + ") = " + Math.tan(Math.toRadians(num)));
            }
            default -> System.out.println("Invalid choice!");
        }
        scanner.close();
    }

    // Factorial method
    private static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
