/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdayShapirko;

import java.util.Scanner;

/**
 *
 * @author Shapirko-O-870a
 */
public class RowNorms {
     static Scanner scanner = new Scanner(System.in);
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Enter row amount please: ");
        int rows = scanner.nextInt();
        
        scanner = new Scanner(System.in);
        System.out.print("Enter col amount please: ");
        int cols = scanner.nextInt();
        
        if (rows <= 0 || cols <= 0) return; //new Exception("Incorrect input!");
        
        var isPositiveMatrix = true;
        
        var matrix = new int [rows][cols];
        scanner = new Scanner(System.in);
        System.out.println("Enter matrix please: ");
        
        //for (int i = 0; i < matrix.length; i++) for (int j = 0; j < cols; j++) matrix[i][j] = scanner.nextInt();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = scanner.nextInt(); 
                if (matrix[i][j] <= 0) {
                    isPositiveMatrix = false;
                    break;
                }
            }
            if (!isPositiveMatrix) break;
        }
        //printMatrix(matrix);
        
        System.out.println("Matrix has only positive numbers and rows norms is ok: " + (isPositiveMatrix && isNormalRows(matrix)));
    }
    
    public static boolean isNormalRows(int [][] matrix){
        var rowSum = 0;
        for (int j = 0; j < matrix[0].length; j++) rowSum += matrix[0][j] * matrix[0][j];
        var normalSum = Math.sqrt(rowSum);
        
        for (int i = 1; i < matrix.length; i++) {
            rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j] * matrix[i][j];
            }
            if (Math.sqrt(rowSum) != normalSum) return false;
        }
        return true;
    }
    
    public static void printMatrix(int [][] flagMatrix){
        for (int i = 0; i < flagMatrix.length; i++) {
            for (int j = 0; j < flagMatrix[0].length; j++) {
                System.out.print(flagMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
