import java.util.Scanner;
public class Ifelse{
    public static void main (String[]args){
        Scanner ticcu = new Scanner(System.in);
        
        System.out.println("enter your age");
         float age =  ticcu.nextFloat();
        System.out.println ("age is :" + ticcu.nextLine());
    
     if (age >=1 && age <=5 ){
        System.out.println("no tickit");
    } else if (age >=5 && age <= 8){
        System.out.println("half tickit");
    } else if (age >= 8 && age <= 50){
        System.out.println("full tickit");
    } else  {
        System.out.println("Senior citizen");
    }


     
    }
}