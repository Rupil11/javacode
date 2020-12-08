import java.io.*;
class Throwclaus { 
  void lordCommander(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException(" Exception Occurred");
     else
        throw new ClassNotFoundException("Class Not Found");
  } 
} 

public class Tough{ 
  public static void main(String args[]){ 
   try{ 
    Throwclaus obj=new Throwclaus(); 
     obj.lordCommander(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}
