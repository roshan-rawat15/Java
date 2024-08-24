import java.util.Scanner;

public class MultiplicationTable {

    public static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();

        printTable(num);

        scanner.close();
    }
}
