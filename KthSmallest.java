import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {7,4,9,2,1,5};

        System.out.print("Enter K: ");

        int k = sc.nextInt();

        Arrays.sort(arr);

        System.out.println(k + "th Smallest = " + arr[k-1]);
    }
}