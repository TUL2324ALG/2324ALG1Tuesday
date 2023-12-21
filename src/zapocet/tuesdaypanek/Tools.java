/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdaypanek;

/**
 *
 * @author Panek-J-d39d
 */
public class Tools {
    public static void main(String[] args) {
        // test sumThreeDigits
        int[] arr1 = new int[] { 1, 10, 99, 100, 305, 1000, 10001 };
        System.out.println(sumThreeDigits(arr1)); // 405
        
        int[] arr2 = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21 }; // { 0, 1, 1, 2, 3, 5, 8, 13, 21 }
        System.out.println(isFibonacci(arr2)); // true
        
        char[][] flag = ukraineFlag(6, '#', '*');
        printMatrix(flag);
    }
    
    /**
     * Helper method for printing a 2D char matrix
     * @param matrix 
     */
    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    /**
     * Get matrix containing characters that make up the flag of Ukraine
     * @param rows even number of rows
     * @param topChar character to use for the top (blue) part
     * @param bottomChar character to use for the bottom (yellow) part
     * @return char matrix
     */
    public static char[][] ukraineFlag(int rows, char topChar, char bottomChar) {     
        char[][] matrix = new char[rows][rows * 3 / 2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i >= matrix.length / 2 ? bottomChar : topChar);
            }
        }
        
        return matrix;
    }
    
    /**
     * Test if given array of integers has fibonacci sequence
     * The sequence must start from 0
     * @param arr
     * @return boolean
     */
    public static boolean isFibonacci(int[] arr) {     
        if(arr.length < 3) return false;
        
        int prev2 = 0;
        int prev = 1;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i] != prev + prev2) return false;
            
            prev2 = arr[i-1];
            prev = arr[i];
        }
        
        return true;
    }
    
    /**
     * Get the sum of all three-digit numbers in a given array
     * @param arr
     * @return int
     */
    public static int sumThreeDigits(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 100 || arr[i] > 999) continue; //JV zaporna trojciferna?
            sum += arr[i];
        }
        
        return sum;
    }
}