import java.util.Scanner;
public class Method {
     static void sayName(){
        Scanner  tour = new Scanner(System.in);
        System.out.println("toh kese hai ap log");
        System.out.println("bs bdiyaa apka aashirwad"+" "+tour.nextLine());
     }

        public static void main(String[] args) {
            Method.sayName();   
        }
}