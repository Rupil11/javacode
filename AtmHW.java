import java.util.Scanner;
public class AtmHW{
    public static void main(String args[] )
    { 
        int balance = 7000, Withdraw, Deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for HOMEPAGE");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                Withdraw = s.nextInt();
                if(balance >= Withdraw)
                {
                    balance = balance - Withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                Deposit = s.nextInt();
                balance = balance + Deposit;
                System.out.println("Your Money has been successfully depo   sited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}