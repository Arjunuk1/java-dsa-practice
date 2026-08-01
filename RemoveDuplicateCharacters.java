import java.util.*;

public class RemoveDuplicateCharacters {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(int i = 0;i<str.length();i++){
            set.add(str.charAt(i));
        }

        for(char ch : set)
            System.out.print(ch);
    }
}
