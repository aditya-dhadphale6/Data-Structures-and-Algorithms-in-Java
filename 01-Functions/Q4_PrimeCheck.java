
import java.util.Scanner;

public class Q4_PrimeCheck{

    public static boolean PrimeCheck(int n){
        boolean isPrime = true;
        if(n<0){
            isPrime = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        boolean isPrime = PrimeCheck(n);

        if(isPrime==true){
            System.out.println(n +" is Prime");
        } else {
            System.out.println(n +" is not Prime");
        }
    }
}