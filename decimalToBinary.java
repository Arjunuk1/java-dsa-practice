public class decimalToBinary {

    public int decimal(int n){
        if(n < 2) return n;

        return (n / 2) * 10 + (n % 2);
    }
}

