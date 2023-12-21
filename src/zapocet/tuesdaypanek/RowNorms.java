/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdaypanek;

import java.util.Scanner;

/**
 *
 * @author Panek-J-d39d
 */
public class RowNorms {
    private static Scanner scanner;
    
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        
        // User input
        double[][] matrix = readUserMatrix();
        //double[][] testMatrix = new double[][] { {3, 0, 0}, {2, 1, 2}, {2, 2, 1} };

        // Calculate
        boolean isValid = isValid(matrix);
        
        // Output
        System.out.println(isValid 
                ? "Matice má kladná čísla a rovné řádkové normy" 
                : "Matice nemá kladná čísla nebo rovné řádkové normy");
    }
    
    /**
     * Tell if numbers in given matrix are positive and if every row norm is equal
     * @param matrix
     * @return boolean
     */
    private static boolean isValid(double[][] matrix) {
        double prevRowSum = -1;
        double rowSum;
        double number;
        
        for (int i = 0; i < matrix.length; i++) {
            rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                number = matrix[i][j];
                if(number < 0) return false; // Not positive -> false
                
                rowSum += number * number;
            }
            
            rowSum = Math.sqrt(rowSum);
            // If prevRowSum is valid and they are not equal -> false
            if(prevRowSum >= 0 && rowSum != prevRowSum) return false;
            prevRowSum = rowSum;
        }
        
        return true;
    }
    
    /**
     * Asks the user to input a double matrix
     * @return double matrix
     */
    private static double[][] readUserMatrix() {
        System.out.println("Zadejte počet řádků matice: ");
        int rows = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Zadejte počet sloupců matice: ");
        int cols = scanner.nextInt();
        scanner.nextLine();
        
        System.out.printf("Zadejte postupně %d hodnot matice: \n", rows * cols);
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
                scanner.nextLine();
            }
        }
        
        return matrix;
    }
}
