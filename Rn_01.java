import java.util.Scanner;

public class Rn_01 {
    

    public static void main ( String[]args){
        
        Scanner info = new Scanner(System.in);
        String  name , pass;
        System.out.println("enter your user name");
        name = info.nextLine();
        System.out.println("enter your password");
        pass = info.nextLine();

        if (name.equals("rupil") && (pass.equals("humapkehaikon"))){
            System.out.println("welcome boss");
        } else {
            System.out.println("sorry take permission first from my boss then login");
        }


    }

    
}