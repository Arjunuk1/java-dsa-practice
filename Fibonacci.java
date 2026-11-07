public class Fibonacci {
    public int fibo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int previous = 0;
        int current = 1;
        for (int i = 0; i < n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10;
        System.out.println("Fibo sequence is: ");
        for (int i = 0; i < n; i++) {
            System.out.println("F(" + i + ") = " + fibonacci.fibo(i));
        }
    }
}