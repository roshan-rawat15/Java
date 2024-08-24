import java.util.*;

public class funAdd {
   public static int Sum(int a, int b){
    int sum=a+b;
    return sum;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int sum = Sum(a, b);
    System.out.println("Sum of 2 numbers is : "+ sum);
   }
    }
