public class Fibonacci {
    /**
     * Returns the nth Fibonacci number, starting with fibo(0) = 0.
     *
     * @param n zero-based position in the sequence
     * @return the Fibonacci number at position n
     * @throws IllegalArgumentException if n is negative
     */
    public int fibo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int previous = 0;
        int current = 1;
        for (int i = 0; i < n; i++) {
            final int next = previous + current;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        final Fibonacci fibonacci = new Fibonacci();
        final int n = 10;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < n; i++) {
            System.out.println("F(" + i + ") = " + fibonacci.fibo(i));
        }
    }
}