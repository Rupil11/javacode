import java.util.Scanner;
public class Rn_practice {
    public static void main(String[]args){
        Scanner rupil = new Scanner(System.in);
        Float x,y,bodmas;

        System.out.println("enter your numbers");
        x = rupil.nextFloat();
        y = rupil.nextFloat();


    //addition
    bodmas = x+y;
    System.out.println("x+y  =  " + bodmas);

    //substraction
    bodmas = x-y;
    System.out.println("x-y  =  " + bodmas);

    //multiplication
    bodmas = x*y;
    System.out.println("x*y  =  " + bodmas);

    //divison 
    bodmas = x/y;
    System.out.println("x/y  =  " + bodmas);

    //mix
    bodmas = x+y*x+y;
    System.out.println("x+y*x+y  =  " + bodmas);

    System.out.println("your calculaton is done over here thankyou");
    }

    
}