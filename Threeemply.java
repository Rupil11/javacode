import java.util.Scanner;
public class Threeemply {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        Scanner emply = new Scanner(System.in);

        System.out.println("enter your name");
        String name = emply.nextLine();
        System.out.println(" hello your name " + name);
        
        System.out.println("enter your work field: 1 / 2/ 3");
        int field = emply.nextInt();
        

        if( field == 1){
            System.out.println("Your Salary is = 1000");
        }else if( field == 2){
            System.out.println("Your Salary is = 2000");
        }else if( field == 3){
            System.out.println("Your Salary is = 3000");
        }else {
            System.out.println("Error!!! invalid field");
        }

    }
    
}
