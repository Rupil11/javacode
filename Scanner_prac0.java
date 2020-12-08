import java.util.Scanner;
public class Scanner_prac0 {
    public static void main(String[]args){
        Scanner nunnu = new Scanner(System.in);
        int a,b,clc;

        System.out.println("enter your number to calculate");
        a = nunnu.nextInt();
        b = nunnu.nextInt();

        clc = a+b;
        System.out.println("add=    "+ clc);

        clc = a-b;
        System.out.println("sub=    " +clc);

        clc = a*b;
        System.out.println("mult=   " +clc);

        clc = a/b;
        System.out.println("divison=" +clc);
    }
    
}