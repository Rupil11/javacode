public class Cn1 {
    static int y;
    int z;
    public static void main (String args[]){
        //local variable
        int x = 8;
        System.out.println(x);
        //Static variable
        Cn1.y = 9;
        System.out.println(Cn1.y);
        //Instance variable
        Cn1 an = new Cn1();
        an.z= 7;
        System.out.println(an.z);
    }
}