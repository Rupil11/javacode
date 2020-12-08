public class Duplicatearray {
     
    public static void main(String[] args) {      
          
         
        int [] arr = new int [] {1, 2, 3, 4, 1, 7, 6, 8, 6};   
          
        System.out.println("Duplicate elements are; ");  
         
        for(int x = 0; x < arr.length; x++) {  
            for(int y = x + 1; y < arr.length; y++) {  
                if(arr[x] == arr[y])  
                    System.out.println(arr[y]);  
            }  
        }  
    }  
}