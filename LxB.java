import java.util.Scanner;
public class LxB {
public static void main(String[]args){

    System.out.println("Welcome press enter to continue your L x B Calculation");

    Scanner l = new Scanner(System.in);
    System.out.println("Enter Length");
    Float length = l.nextFloat();
    

    Scanner b = new Scanner (System.in);
    System.out.println("Enter breath");
    Float breath = b.nextFloat();

    System.out.println(length*breath);
    
}
    
}
