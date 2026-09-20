import java.util.*;

public class Q2_Factorial{
    public static int fact(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = fact(n);

        System.out.println("Factorial of " + n + " is " + factorial);
    }
}