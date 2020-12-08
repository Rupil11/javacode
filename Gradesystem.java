import java.util.Scanner;
public class Gradesystem{
    public static void main(String[]args){
        Scanner grade = new Scanner(System.in);
        
        System.out.println("grade");
        

        float perc = grade.nextFloat();

        if (  perc >= 1 && perc <= 20  ){
            System.out.println("F" );
        } else if (  perc >= 20 && perc <= 30  ){
            System.out.println("D");
        } else if (  perc >= 30 && perc <= 60  ){
            System.out.println("C");
        } else if (  perc >= 60 && perc <= 80  ){
            System.out.println("B");
        } else if (  perc >= 80 && perc <= 90  ){
            System.out.println("A");
        }else{
            System.out.println("A+ congratulations");
        }
    }
}