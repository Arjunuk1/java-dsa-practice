import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number: ");

            int n = sc.nextInt();

            if (isPerfectNumber(n)) {
                System.out.println("Perfect Number");
            } else {
                System.out.println("Not Perfect Number");
            }
        }
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}