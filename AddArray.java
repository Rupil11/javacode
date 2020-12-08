import java.util.Arrays; 
public class AddArray {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
     
         
        
        int position = 5;
        int newValue    = 8;
     
       System.out.println("Original Array : "+Arrays.toString(array));     
        
       for(int i=array.length-1; i > position; i--){
         array[i] = array[i-1];
        }
        array[position] = newValue;
        System.out.println("New Array: "+Arrays.toString(array));
      }
}


 

 
 