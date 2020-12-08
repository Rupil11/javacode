public class Suroor {
    
    int price;
    String name;
    float alcohollevel;



    Suroor(int price,String name,float alcohollevel){

    this.price = price;
    this.name  = name;
    this.alcohollevel = alcohollevel;
    }
    public static void main(String[] args) {
    
        Suroor daru = new Suroor(1000,"steler",40);
        System.out.println(daru.price);
        
        Suroor khamba = new Suroor(2500,"black/white",60);
        System.out.println(khamba.name);

    }
    
}
