import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please press 1 for Rectangle and 2 for circle");
        int chocice = sn.nextInt();
        if(chocice == 1){
            System.out.println("Please enter lenght");
            int len = sn.nextInt();
            System.out.println("Please Enter breadth");
            int breath = sn.nextInt();
            Rectangle r = new Rectangle();
            System.out.println("Area of the rectangle " + r.calculateArea(len, breath));
        } else if (chocice == 2) {
                
        } else {
            System.out.println("Wrong value");
        }
        
    }
}

class Rectangle{
    int lenght;
    int breadth;
   
    int calculateArea(int l , int b){
        //int ar = l * b;
        return l*b;
    }

}

class Circle {
    int radius;

    int calculateArea(int ra){
        return 2*3.14 *(ra*ra);
    }
}
