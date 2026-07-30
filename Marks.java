import java.util.*;

class InvalidMarksException extends Exception{
    InvalidMarksException(String msg){
        super(msg);
    }
}

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100)
                throw new InvalidMarksException("Invalid Marks");

            System.out.println("Valid Marks");

        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}