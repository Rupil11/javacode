public class Car {
    String name;
    String model;
    String engin;
    int seats;

    public static void main(String []args){

    Car mustang = new Car();
    mustang.name = "chevi mustang";
    mustang.model = "Gt";
    mustang.engin = "750 HP";
    mustang.seats = 2 ;
    
    System.out.println(mustang.name);
    System.out.println(mustang.model);
    System.out.println(mustang.engin);
    System.out.println(mustang.seats);
    } 
}
