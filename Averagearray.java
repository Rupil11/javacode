public class Averagearray {
    public static void main(String[] args) {
        double[] numArr ={12,45,85,56,89,56,86};
                double sum = 0.0;
        
                for (double num: numArr) {
                   sum += num;
                }
        
                double average = sum / numArr.length;
                System.out.format("average is - "+ average);
            
        }
    }
    

