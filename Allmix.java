public class Allmix {
    static int b;
    int c;
    public static void main(String []args){
        //Local

        int a= 99;
        System.out.println(a+1);

        //Static 

        Allmix.b = 30;
        System.out.println(b+70);

        //Instance
        Allmix rain = new Allmix();
        rain.c = 50;
        System.out.println(rain.c + 50);

    }
    
}