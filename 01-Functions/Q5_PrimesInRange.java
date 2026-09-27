import java.util.Scanner;

public class Q5_PrimesInRange {

    public static void PrimesInRange(int n) {
        if (n < 0) {
            System.out.println("Invalid Input");
        } else {

            for (int r = 1; r <= n; r++) {

                boolean isPrime = true;

                if (r <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(r); i++) {
                        if (r % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.println(r + " is Prime");
                } else {
                    System.out.println(r + " is not Prime");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        PrimesInRange(n);
    }
}