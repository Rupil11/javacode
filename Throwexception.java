public class Throwexception extends Exception {

    String hmm;

    Throwexception(String yoo){
        hmm = yoo;
    }
    public String toString(){
        return ("My way of talking when i feel booringggg: " + hmm);
    }
}
class Wakeup{
    public static void main(String[] args) {
        
        try {
            System.out.println("let me try once to change your mood");
            
            throw new Throwexception("damn its to difficult sorry i cant");
        }
        catch(Throwexception e){
        System.out.println("got it");
        System.out.println(e);
         }
    }
}
