import java.util.*;

public class Q1_ProductOfAAndB {

    public static int multiply(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a x b " + multiply(a,b));
    }
}