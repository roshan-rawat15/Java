import java.util.Scanner;

public class div {

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextInt();
        double number2 = sc.nextInt();
        
       
        double result = divide(number1, number2);
        // Print the result
        System.out.println("The quotient is: " + result);
    }
}

    
 
