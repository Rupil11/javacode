
public class Mix {
    static int b;
    int c;
    public static void main (String[] args){
        //local
        int a = 1;
        System.out.println(a + 9);
        //Static
        Mix.b = 11;
        System.out.println(b-1);
        //instance
        Mix yoyo = new Mix();
        yoyo.c = 5;
        System.out.println(yoyo.c+5);
    }

}