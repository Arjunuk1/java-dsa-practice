import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("First String: ");
            final String s1 = sc.nextLine();

            System.out.print("Second String: ");
            final String s2 = sc.nextLine();

            if (isAnagram(s1, s2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        }
    }

    public static boolean isAnagram(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        final char[] a = normalize(first).toCharArray();
        final char[] b = normalize(second).toCharArray();

        if (a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    private static String normalize(String value) {
        return value.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
    }
}