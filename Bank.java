import java.util.*;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String str){
        super(str);
    }
}

public class Bank {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double balance = scn.nextDouble();

        double amount = scn.nextDouble();

        try{
            if(amount > balance)
                throw new InsufficientBalanceException("Insufficient balance");
                balance -= amount;
                System.out.println("Remaining Balance = " + balance);
            }catch(Exception e){
                System.out.println(e.getMessage());
        }
    }
}
