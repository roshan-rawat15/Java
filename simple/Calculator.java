import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the first number from the user
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();

        // Get the second number from the user
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        // Display the operation menu
        System.out.println("Select an operation:");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: * (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo)");

        // Get the operation choice from the user
        System.out.print("Enter the number of the operation you want to perform: ");
        int operation = sc.nextInt();

        // Variable to store the result
        double result = 0;
        boolean validOperation = true;

        // Perform the operation based on the user's choice
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case 2:
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case 3:
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println(a + " % " + b + " = " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation selection.");
                validOperation = false;
        }

        // Close the scanner

    }
}
