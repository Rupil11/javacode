class Teacher{
    void human(){
        System.out.println(" i am a Teacher");
    }
}
class Student extends Teacher {
    void insaan(){
        System.out.println(" i am Student");
    }
}
class School extends Student{
    void manushya(){
        System.out.println("our second home is our school");
    }
}
public class Homosapine extends School {

    public static void main(String[] args) {
        Homosapine obj = new Homosapine();
        obj.human();
        obj.insaan();
        obj.manushya();
       
    }
    
}
