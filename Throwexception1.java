
class Throwexception1 extends Exception
{
    public Throwexception1(String s)
    {
    
        super(s);
    }
}
 
public class Vote {

    int age;

    void forSure(int weight) throws Throwexception1{
	if(age<18){
		throw new Throwexception1(" invalid age");
	}else {
        System.out.println("you can vote");
    }
   }
   
    public static void main(String args[])
    {
    	Vote obj = new Vote();
        try
        {
            obj.forSure(18);
        }
        catch (Throwexception1 ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}