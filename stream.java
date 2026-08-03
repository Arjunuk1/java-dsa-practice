import java.util.*;

public class stream {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(40);

        list.stream()
            .filter(x -> x > 30)
            .sorted()
            .forEach(System.out::println);
    }
}
