public class countBIts {
    public int countbits(int n){
        if(n == 0) return 0;

        return (n & 1) + countbits(n >> 1);
    }
}


