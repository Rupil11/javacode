public class Mobilephone {
    // name - local
    // processor - class/static (865)
    // ram - instance
    // price - instance
    // obj- one plus  and samsung
    //  int n;
    static int  p;
    String r;
    String pr;
    public static void main(String[] args){
       int  n = 123;
       System.out.println(n);

        Mobilephone.p = 865;
        System.out.println(p);

        Mobilephone oneplus = new Mobilephone();
        oneplus.r = "samsung";
        System.out.println(oneplus.r);

        Mobilephone samsung = new Mobilephone();
        samsung.pr = "oneplus"
        System.out.println(samsung.pr);



    }
    
}
