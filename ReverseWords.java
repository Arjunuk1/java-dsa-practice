import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.hasNextLine() ? scn.nextLine().trim() : "";
        scn.close();

        if (str.isEmpty()) {
            return;
        }

        String[] words = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            if (i < words.length - 1) {
                System.out.print(" ");
            }
            System.out.print(words[i]);
        }
        System.out.println();
    }
}
