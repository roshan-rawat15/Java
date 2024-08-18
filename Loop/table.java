import java.util.*;;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no=");
        int n = sc.nextInt();

        System.out.println("Multiplication tsble of" + n + ":");
        for(int i=1;i<=10;i++){
            System.out.println(n + "*" + i + "=" + (n*i));
        }
    }
}
