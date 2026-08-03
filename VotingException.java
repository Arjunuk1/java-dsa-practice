import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}

public class VotingException {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        try{
            if(age < 18){
                throw new InvalidAgeException("Invalid Age");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
