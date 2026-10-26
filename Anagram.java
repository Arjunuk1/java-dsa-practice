import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("First String: ");
            String s1 = sc.nextLine();

            System.out.print("Second String: ");
            String s2 = sc.nextLine();

            if (isAnagram(s1, s2))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String first, String second) {
        char[] a = first.toLowerCase(Locale.ROOT).toCharArray();
        char[] b = second.toLowerCase(Locale.ROOT).toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}