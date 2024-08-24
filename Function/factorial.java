import java.util.Scanner;

public class factorial {
        public static void factorial(int num) {
            if(num<0){
                System.out.println("Invalid Number");
                return ;
            }
            int fact = 1;

            for (int i = num; i>=1; i--) {
                fact *= i;
            }
           System.out.println("The factorial of " + num + " is: " + fact);
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            factorial(num);
           
        }
    }
    
