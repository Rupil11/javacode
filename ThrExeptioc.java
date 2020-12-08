class Throwexceptionnn extends Exception{  
    Throwexceptionnn(String s){  
     super(s);  
    }  
   }  
class ThrExeptioc{  
     
      static void validate(int age)throws Throwexceptionnn{  
        if(age<18)  
         throw new Throw  exceptionnn("not valid");  
        else  
         System.out.println("welcome to Brazzers");  
      }  
        
      public static void main(String args[]){  
         try{  
         validate(13);  
         }catch(Exception e){System.out.println("Exception occured: "+e);}  
     
         System.out.println("noooo");  
     }  
   }  
