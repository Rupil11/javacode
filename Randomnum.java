import java.util.Random;

public class Randomnum {

    public static void main(String[] args) {
        Random ran = new Random();

        int one = ran.nextInt(1000);
        
        System.out.println("Random integer : " + one);
    }
    
}
