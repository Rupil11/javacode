import java.util.Scanner;
public class CandS {

public static void main(String[]args){
    Scanner cr = new Scanner (System.in);
    System.out.println(" press c to find circle area or r to find  rectangle area ");
    String choice = cr.nextLine();
    System.out.println(" You choose " + cr.nextline());
    


    
    if(choice == c){
        Scanner crcl = new Scanner (System.in);
        System.out.println( "Enter radius ");
        Float radius = crcl.nextFloat();
        System.out.println("Area of circle is " + r.calculateArea(3.14*r*r));

        
    } else if (choice == r){
        Scanner lb = new Scanner(System.in);
        System.out.println("Enter Lenght");
        Float length = lb.nextFloat();
        System.out.println("Enter Breadth");
        Float breath = lb.nextFloat();
        Rectangle re = new Rectangle();
        System.out.println("Area of rectange is " + re.calculateArea(length*breath));

    } else{
            System.out.println("this is not suitable press");    
     }

}


   
    class Circle{
    int radii;
    int calculateArea( int r){
        //int ar = 2*3.14*(r*r);
        return 2*3.14*(r*r);
    }
 }
  

    class Rectangle{
    int length;
    int breath;
    int calculateArea(int le, int br){
    //  int ar = le * br; 
        return le*br;
    }
 }

