import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        while (true) {
            System.out.print("Enter choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed!");
                        }
                        break;
                }
            } else {
                System.out.println("Invalid choice! Please select a valid operation.");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            scanner.nextLine(); // Consume the newline
            String nextCalculation = scanner.nextLine();
            if (!nextCalculation.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using the Calculator!");
                break;
            }
        }

        scanner.close();
    }
}
