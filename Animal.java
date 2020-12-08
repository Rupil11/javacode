class Bird{

    String colour;

    public void catagory(){
        colour = "green";
        System.out.println("bird colour is = " + colour);
    }
}



public class Animal extends Bird {

    public static void main(String[] args) {
        Animal obj = new Animal();
    
     obj.catagory();
    }

    
}
