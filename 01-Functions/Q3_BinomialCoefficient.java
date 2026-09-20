import java.util.*;

public class Q3_BinomialCoefficient {
    public static int fact(int a){
        int factorial = 1;
        for(int i = 1; i <= a; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int r = sc.nextInt();

        int binomialCoefficient = fact(n) / (fact(r) * fact(n - r));




        System.out.println("BinomialCoefficient of " + n + "C" + r + " is " + binomialCoefficient);
    }
}