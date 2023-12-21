package zapocet.tuesdayShapirko;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shapirko-O-870a
 */
public class Tools {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var r1 = new int [] {100, 0,3, 1234, 1000, 234, -400};
        var r2 = new int [] {0,1,1,2,3,5,8};
        var r3 = new int [] {2,3,5,8};
        System.out.println(sumThreeDigits(r1));
        System.out.println(isFibonacci(r2));
        System.out.println(isFibonacci(r3));
    }
    
    /**
     * @param arr of int
     * @return sum of number
     */
    public static int sumThreeDigits(int [] arr){
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             //var 1 in need sum of all numbers >= 100 [123, 7, 123] -> 123+ 123
             var normalNegative = (arr[i] < 0) ? arr[i] * (-1) : arr[i]; //JV proc jste prohazovala znamenko? Zaporna hodnota se mela odecitat
             if (normalNegative / 100 > 0 && normalNegative / 100 < 10) sum += arr[i];
             
             //var 2 if need sum of digits all numbers >= 100; example: [123,56,123] -> 1+2+3 +1+2+3
             //if (arr[i] / 100 > 0 && arr[i] / 100 < 10) sum += arr[i] / 100 + arr[i] / 10 % 10 + arr[i] % 10;
         }
         return sum;
    }
    
    public static boolean isFibonacci(int [] arr){
        if (arr[0] != 0 || arr[1] != 1) return false;
        for (int i = 1; i < arr.length - 1; i++)if (arr[i-1] + arr[i] != arr[i+1]) return false;
        return true;
    }
    
    public static char [][] ukraineFlag(int width, char top, char bottom){
        // width:length = 2:3
        int len = (width / 2) * 3;
        var flagMatrix = new char [width][len];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < len; j++) {
                flagMatrix[i][j] = (i < (width / 2)) ? top : bottom;
            }
        }
        return flagMatrix;
    }
    
    public static void printMatrix(char [][] flagMatrix){
        for (int i = 0; i < flagMatrix.length; i++) {
            for (int j = 0; j < flagMatrix[0].length; j++) {
                System.out.print(flagMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
