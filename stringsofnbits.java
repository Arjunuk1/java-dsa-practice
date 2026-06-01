import java.util.Scanner;

public class stringsofnbits {
    public static void generate(int n, String ans){
        if(ans.length() == n){
            System.out.println(ans);
            return;
        }

        generate(n, ans + "0");

        generate(n, ans + "1");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        generate(n, "");
    }
}
