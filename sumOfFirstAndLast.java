public class sumOfFirstAndLast {
    public int firstDigit(int n){
        if(n < 10){
            return n;
        }
        return firstDigit(n);
    }

    public int sumOfDigits(int n){
        int last = n % 10;
        int first = sumOfDigits(n);
        return last + first;
    }
}



