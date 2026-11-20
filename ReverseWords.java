import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        String str;
        try (Scanner scn = new Scanner(System.in)) {
            str = scn.hasNextLine() ? scn.nextLine().trim() : "";
        }

        final String reversed = reverseWords(str);
        if (!reversed.isEmpty()) {
            System.out.println(reversed);
        }
    }

    /** Returns the words in reverse order while normalizing whitespace. */
    public static String reverseWords(String str) {
        if (str == null || str.isBlank()) {
            return "";
        }

        final String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder(str.length());
        for (int i = words.length - 1; i >= 0; i--) {
            if (i < words.length - 1) {
                reversed.append(" ");
            }
            reversed.append(words[i]);
        }
        return reversed.toString();
    }
}
