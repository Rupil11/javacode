public class Array2 {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
           if (item == n) {
              return true;
           }
        }
        return false;
     }
     public static void main(String[] args) {
            int[] array2 = {21,85,46,72,52,73,80};
        System.out.println(contains(array2, 85));
        System.out.println(contains(array2, 10));
     }
  }