import java.util.*;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int x = a;
        int y = b;

        while(y != 0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}
