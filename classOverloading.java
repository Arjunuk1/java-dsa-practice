import java.util.*;

public class classOverloading {
    
    public void sum(int arr[], int size){
        int sum = 0;
        for(int i = 0;i<size;i++){
            sum += arr[i];
        }

        System.out.println("Sum of Integer arr : " + sum);
    }

    public void sum(float arr[], int size){
        float sum = 0;
        for(int i = 0;i<size;i++){
            sum+=arr[i];
        }

        System.out.printf("Sum of float arr : %.1f\n", sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int intArr[] = new int[n];
        float floatArr[] = new float[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            floatArr[i] = sc.nextFloat();
        }

        classOverloading obj = new classOverloading();

        obj.sum(intArr, n);
        obj.sum(floatArr, n);
    }
}
