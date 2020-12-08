import java.util.Scanner;
public class Scanner2_0 {
    public static void main(String[]args){
     
        int a ,b , ans;
        Scanner clc = new Scanner(System.in);
        
        System.out.println ("enter your number");
        a = clc.nextInt();
        b = clc.nextInt();

         ans=a+b ;
        System.out.println("addition = " + ans);

         ans=a-b ;
        System.out.println ("substraction = " +ans);
        
         ans = a*b;
        System.out.println ("multiplication = " + ans);

        ans = a/b;
        System.out.println ("divison = "+ ans);

    }
    
}