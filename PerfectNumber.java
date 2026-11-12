import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");

            int n = sc.nextInt();

            if (isPerfectNumber(n)) {
                System.out.println("Perfect Number");
            } else {
                System.out.println("Not Perfect Number");
            }
        }
    }

    // A perfect number equals the sum of its positive divisors excluding itself.
    public static boolean isPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }

        long sum = 1;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                int pairedDivisor = n / i;
                sum += i;
                if (i != pairedDivisor) {
                    sum += pairedDivisor;
                }
            }
        }

        return sum == n;
    }
}