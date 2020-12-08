import java.util.Scanner;
public class Question7 {

    public static void main(String[] args) {

        int r;
        double vol;
        double p;
        Scanner spr = new Scanner(System.in);
        System.out.println("enter the radius of sphere");
        r = spr.nextInt();

        p= 3.14;
        vol = (3.0/4.0)*p*(r*r*r);

        System.out.println("volume of sphere = " + vol);


    }
    
}
