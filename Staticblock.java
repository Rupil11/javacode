public class Staticblock {

    static int a = 10;
    final int b =10;

    static{
        System.out.println("Static block");
        Staticblock.b = a * 5;

    }
    public static void main(String[] args) {
        
        System.out.println("value of a : " + a);
        System.out.println("value of b : " + Staticblock.b);
    }
    
}
