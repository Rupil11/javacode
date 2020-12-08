public class Sanitizer {
    int price;
    String ml;

    public static void main(String[] args) {
       Sanitizer detol = new Sanitizer();
       detol.price = 50;
       detol.ml = "100ml"; 
       System.out.println(detol.price);
       System.out.println(detol.ml);
    }

    
}
