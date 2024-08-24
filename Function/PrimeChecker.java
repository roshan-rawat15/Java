import java.util.Scanner;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        // Eliminate even numbers and multiples of 3
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        // Check from 5 to the square root of the number
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is prime: ");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
    }
}
