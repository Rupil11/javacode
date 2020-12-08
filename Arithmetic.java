public class Arithmetic {
    public String getName(){
        return "Arithmetic";
        
    }
    public static void main(String[] args) {
        Arithmetic arti = new Arithmetic();
   
        arti.getName();
        arti.add(4,5);
    }
}
class Adder {
    static int add(int a, int b){
         return a+b;
        }   
    
}
 