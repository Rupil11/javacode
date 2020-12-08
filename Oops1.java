class DOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
class Oops1
{
   public static void main(String args[])
   {
       DOverloading obj = new DOverloading();
       obj.disp('a');
       obj.disp('a',1113);
   }
}
