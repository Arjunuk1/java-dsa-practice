import java.util.*;

public class productOfAll {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        int prod = 1;

        for(int i = 0;i<n;i++){
            prod *= arr[i];
        }

        System.out.println(prod);
    }
}
