import java.util.Scanner;

public class Contactsaving {

public static void main(String[] args) {

   
    
    Scanner contact = new Scanner(System.in);

    System.out.println(" Enter first name");
    String first = contact.nextLine();

    System.out.println("Enter last name");
    String last = contact.nextLine();

    
    System.out.println("press 1 for mobile no and press 2 for landline");
    int num = contact.nextInt();

    System.out.println("Enter contact number");
    Long number = contact.nextLong();
    
    Long nnn = number.length();
    
    if(nnn < 11){
        switch (num) {
        case 1 : 

                System.out.println("mobile no is = " +number);
                break;
        case 2 :
                
                System.out.println("office no is = " +number);
                break;
        
        default :
                System.out.println("Error!!!");
                break;
    }
    }
    else{
        System.out.println("Error number entered is too long");
    }




    System.out.println("Contact Name = " + first +" "+ last );
    System.out.println("Contact Number =" + number);
    System.out.println();
}
    
}
