import java.util.Scanner;
public class Bank {
    

    public static void main(String[] args) {
        
        int bal = 700;
        System.out.println(" enter  your amount");
        Scanner sn = new Scanner(System.in);
        int amt = sn.nextInt();
        try {
            if(amt>bal){
                throw new BalanceException("Insufficent Balance");
            } else {
                bal = bal - amt;
                System.out.println("Balance = " + bal);
            }
        } catch (BalanceException e) {
            System.out.println(e);
        }

        System.out.println("Program end");
       
    }
    
}

class BalanceException extends Exception {
    BalanceException(String str){
        super(str);
    }
}