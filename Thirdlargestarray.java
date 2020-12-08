public class Thirdlargestarray {


    public static void main(String args[]){
        int x;
        int size;
        int array[] = {10, 20, 40, 60, 50, 30};
        size = array.length;
        
        for(int i = 0; i<size; i++ ){
           for(int j = i+1; j<size; j++){
              if(array[i]>array[j]){
                 x = array[i];
                 array[i]  =  array[j];
                 array[j]  =  x;
              }
           }
        }
        System.out.println("Third largest number is - "+array[size-4]);
        }
    
}
