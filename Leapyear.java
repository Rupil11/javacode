 import java.util.Scanner;

//hard code 

// public class Leapyear {

    
//     public static void main(String[] args) {
//         int year = 2006;
//         boolean leap;

//         if (year % 4 == 0){
//             System.out.println("it is a leap year");
//         }
//         else{
//             System.out.println("it is not a leap year");
//         }
        
//     }

// }

public class Leapyear {

    
    public static void main(String[] args) {
        Scanner year =new Scanner(System.in);
        System.out.println("Enter year");
        int leap = year.nextInt();

        if (leap % 4 == 0){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
        
    }

}
