import java.util.*;

public class streamapi1 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int number : arr) {
            map.put(number, number);
        }

        int[] uniqueNumbers = new int[map.size()];
        int index = 0;
        for (int number : map.keySet()) {
            uniqueNumbers[index] = number;
            index++;
        }

        Arrays.sort(uniqueNumbers);

        for (int number : uniqueNumbers) {
            if (number > 5) {
                System.out.println(number * 3);
            }
        }
    }
}
