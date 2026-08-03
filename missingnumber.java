public class missingnumber {
    
    static int missingNumber(int arr[], int n){
        int sum = n * (n + 1) / 2;
        for(int num : arr){
            sum -= num;
        }
        return sum;
    }

}
