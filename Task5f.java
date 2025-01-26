import java.util.Scanner;

public class Task5f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double result;

        if (choice == 1) {
            result = num1 + num2;
            System.out.println("The result of addition is: " + result);
        } else if (choice == 2) {
            result = num1 - num2;
            System.out.println("The result of subtraction is: " + result);
        } else if (choice == 3) {
            result = num1 * num2;
            System.out.println("The result of multiplication is: " + result);
        } else if (choice == 4) {
            // Check for division by zero
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                result = num1 / num2;
                System.out.println("The result of division is: " + result);
            }
        } else {
            System.out.println("Invalid choice. Please select a valid operation.");
        }

        scanner.close();
    }
}
