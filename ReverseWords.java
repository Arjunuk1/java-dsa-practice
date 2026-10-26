import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.hasNextLine() ? scn.nextLine().trim() : "";
        scn.close();

        String reversed = reverseWords(str);
        if (!reversed.isEmpty()) {
            System.out.println(reversed);
        }
    }

    public static String reverseWords(String str) {
        if (str.isEmpty()) {
            return "";
        }

        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (i < words.length - 1) {
                reversed.append(" ");
            }
            reversed.append(words[i]);
        }
        return reversed.toString();
    }
}
