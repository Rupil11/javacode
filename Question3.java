import java.util.Scanner;

public class Question3 {
    

    public static void main(String[] args) {

        double f;
        double c;

        Scanner temp = new Scanner(System.in);
        System.out.println( " insert temp in Faranite " );
        
        f = temp.nextDouble();

        c = (f-32)*5/9;

        System.out.println(c);
         
        
    }

}
