import java.util.Scanner;
public class Ecom1 {
    public static void main (String [] args){
        //Ecommerce - Choosing a product A, B OR C
        System.out.println("Kidly choose A or B or C product for price");

        Scanner pn = new Scanner(System.in);
        char Pn = pn.next().charAt(0);
        if(Pn==65||Pn==97){
            System.out.println("Product A Price is 500");
        } else if(Pn==66||Pn==98) {
            System.out.println("Product B Price is 800");
        } else if(Pn==67||Pn==99){
            System.out.println("Product C Price is 1500");
        } else {
            System.out.println("Please input prodcut between A, B, C or a, b, c only");
        }

    }
    
}
