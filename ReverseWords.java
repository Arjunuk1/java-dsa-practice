import java.util.Scanner;

public class ReverseWords {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String words[] = str.split(" ");

        for(int i = words.length - 1; i >= 0 ; i--){
            System.out.print(words[i] +" ");
        }
    }
}
