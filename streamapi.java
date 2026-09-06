import java.util.*;

public class streamapi {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Integer> number = new ArrayList<>();
        for(int i = 0;i<n;i++){
            number.add(scn.nextInt());
        }
        number.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .forEach(System.out::println);

        scn.close();
    }
}
