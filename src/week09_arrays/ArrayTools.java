package week09_arrays;

public class ArrayTools {
    //testing
    public static void main(String[] args) {
        int[] b = {5,4,9};
        System.out.println(ArrayTools.sum(b));
        System.out.println(ArrayTools.multiply(b));
    }
    
    public static int sum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }
    
    public static int multiply(int[] a){
        int mult = 1;
        for (int i = 0; i < a.length; i++){
            mult = mult * a[i];
        }
        return mult;
    }
    
    public static int max(int[] a){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    
    public static int minIndex(int[] a){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
}
