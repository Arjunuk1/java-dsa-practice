import java.util.Scanner;

public class largerbtw2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            int firstNumber = scn.nextInt();
            int secondNumber = scn.nextInt();

            if (firstNumber >= secondNumber) {
                System.out.println(firstNumber);
            } else {
                System.out.println(secondNumber);
            }
        }

        scn.close();
    }
}
