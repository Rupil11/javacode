import java.util.Scanner;
public class Emply_prac {
   static String name;
   static float salary;
         public static void sayEmply(){
 
         Scanner nunnu = new Scanner(System.in);
         System.out.println("Salary jaan ne hai toh nam boll");
         name = nunnu.nextLine();
         System.out.println(" teri salary dall");
         salary = nunnu.nextFloat();
       }
         public void dis(){
            System.out.println( "your name is = " + name);
            System.out.println (" your salary is =" + salary);
         }
          public static void main (String[]args){
              Emply_prac hh = new Emply_prac();
              Emply_prac.sayEmply();
              hh.dis();
          }


    
}