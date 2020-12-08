import java.util.Scanner;

public class Customexception{

    static int balone   =50000;
    
    static int accone   = 12345;
    
    Scanner sc = new Scanner(System.in);

    void Acc(){
        int input = sc.nextInt();
        switch(input){
            case 1 :
                System.out.println("please enter your acc. no");
                int acn = sc.nextInt();
                if(accone == acn){
                    System.out.println("balance is = " + balone);
                }else{
                    System.out.println("invalid acc. number");
                }
                break;
        }
    }
    void deposit(){
        
        System.out.println("enter amount to deposit");
        int amount = sc.nextInt();
        balone= balone+amount;
        System.out.println("now! acc balance is = " + balone);
    }
    void withdraw(){
        int out = sc.nextInt();
        switch(out){
        case 3 : 
            System.out.println("enter amount to withdraw");
            int in = sc.nextInt();
            if( in <= balone){
                System.out.println("withdraw done!!!");
                int n = balone-in;
                System.out.println("balance left = " + n);
            }
            break;
        }
    }
    public static void main(String[] args) {
        System.out.println("press 1 for banking");
        System.out.println("press 2 for deposit");
        System.out.println("press 3 for withdraw");
         
        Customexception obj = new Customexception();
        obj.Acc();
        obj.deposit();
        obj.withdraw();
    }
}