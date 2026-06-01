public class sum_of_digits {
    public int sum(int n){
        if(n < 0) return -sum(-n);
        if(n < 10) return n;
        return (n%10) + sum(n/10);
    }
}
