import java.util.Scanner;



public class Question5 {

    

public static void main(String[] args) {

    float a;
    float b;
   float fnl;

    Scanner clc = new Scanner(System.in);
    System.out.println("enter number which you want to calculate");
    a = clc.nextFloat();
    b = clc.nextFloat();

    
    
    // add
    fnl = a+b;
    System.out.println(a+b);

    //substract
    fnl = a-b;
    System.out.println(a-b);

    //multiply
    fnl = a*b;
    System.out.println(a*b);

    //divide
    fnl = a/b;
    System.out.println(a/b);



}
    
}
