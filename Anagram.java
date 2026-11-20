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

    /** Compares two strings while ignoring whitespace and letter case. */
    public static boolean isAnagram(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        if (first.equals(second)) {
            return true;
        }

        final char[] firstLetters = normalize(first).toCharArray();
        final char[] secondLetters = normalize(second).toCharArray();

        if (firstLetters.length != secondLetters.length) {
            return false;
        }

        Arrays.sort(firstLetters);
        Arrays.sort(secondLetters);

        return Arrays.equals(firstLetters, secondLetters);
    }

    private static String normalize(String value) {
        return value.replaceAll("\\s+", "").toLowerCase(Locale.ROOT);
    }
}