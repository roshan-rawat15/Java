import java.util.*;

public class funMul {
        public static int multiply(int num1, int num2) {
            return num1 * num2;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            int result = multiply(number1, number2);
            System.out.println("The product is: " + result);
        }
    }
    

