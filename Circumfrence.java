import java.util.Scanner;

public class Circumfrence {
    
    public static void main(String[] args) {

        double radii;
        double pie;
        double result;
    Scanner circle = new Scanner(System.in);
    System.out.println("hie! to calculate the circumference of circle enter Radius");
    radii = circle.nextDouble();

    pie   = 3.14;

    result = (2)* pie * radii;

    System.out.println(result);
        
    }
}
