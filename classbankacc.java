import java.util.*;

public class classbankacc {
    String name;
    double balance;
    int transactions;
    
    classbankacc(String name){
        this.name = name;
        this.balance = 0;
        this.transactions = 0;
    }

    public void deposit(int amount){
        if(amount >= 0 && amount <= 500){
            balance = balance + amount;
            transactions++;
        }
    }

    public boolean bankFees(int fee){
        int totalfee = 0;

        for(int i = 1;i<=transactions;i++){
            totalfee += i * fee;
        }

        balance = balance - totalfee;

        if(balance > 0){
            return true;
        }else{
            balance = 0;
            return false;
        }
    }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            String name = sc.next();

            classbankacc acc = new classbankacc(name);

            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {
                int amt = sc.nextInt();
                acc.deposit(amt);
            }

            int fee = sc.nextInt();

            System.out.println(acc.bankFees(fee));
        }
    }
}
}