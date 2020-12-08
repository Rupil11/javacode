import java.util.Scanner;
public class Tic {

    public static void main(String[]args){
     
        Scanner tictok = new Scanner(System.in);
        System.out.println("enter your name");
        String name = tictok.nextLine();
        System.out.println("Please Enter Your age");
        int age = tictok.nextInt();
        System.out.println("Hello! sir Your Name is " + name);

        if (age >= 0 && age <=11) {
            System.out.println("KId = Free ticket");
        } else if (age>=12 && age<=20) {
            System.out.println("Youngester = half tickit(20 rs.) ");
            
        } else if (age >= 21 && age<=45) {
            System.out.println("adult = full tickit (40 rs.) ");

        } else {
            System.out.println("Full ticket");
        }


        // if (age>=0 && age<=11){
        // System.out.println("Kid = free tickit(0 rs.)");
        
        // } else if (age>=12 && age<=20);{
        // System.out.println("Youngester = half tickit(20 rs.) ");
        
        // } else if (age>=21 && age<=45){
        // System.out.println("adult = full tickit (40 rs.) ");
        
        // } else (age>=46 && age<=100){
        // System.out.println("seniour citizen = full tickit - 10 (30 rs.) ");
        // }




    }

    
}
