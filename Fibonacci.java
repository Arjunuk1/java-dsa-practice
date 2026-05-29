public class Fibonacci {
    public int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10;
        System.out.println("Fibo sequence is: ");
        for(int i = 0;i<n;i++){
            System.out.println("F(" + i + ") = " + fibonacci.fibo(i));
        }
    }
}