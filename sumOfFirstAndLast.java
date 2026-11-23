public class sumOfFirstAndLast {
    public int firstDigit(int n){
        int absolute = Math.abs(n);
        if (absolute < 10) {
            return absolute;
        }
        return firstDigit(absolute / 10);
    }

    public int sumOfDigits(int n){
        int absolute = Math.abs(n);
        int last = absolute % 10;
        int first = firstDigit(absolute);
        return last + first;
    }
}



