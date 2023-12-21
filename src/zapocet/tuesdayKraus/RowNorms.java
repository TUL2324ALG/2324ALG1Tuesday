/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapocet.tuesdayKraus;

import java.util.Scanner;

/**
 *
 * @author Kraus-J-cc59
 */
public class RowNorms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("zadej sirku");
        int width = sc.nextInt();
        System.out.println("zadej delku");
        int height = sc.nextInt();
        
        
        double[][] mat = new double[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.println("zadej [" + i + ";" + j + "] prvek matice");
                mat[i][j] = sc.nextInt();
            }
        }
        
        matCheckNegativeNumbers(mat, width, height);
        matCheckRowNorm(mat, width, height);
        
    }
    
    public static void matCheckNegativeNumbers(double[][] mat, int width, int height) { //JV vhodnejsi, aby metoda vracela data - boolean
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                String message = mat[i][j] < 0? "matice obsahuje zapor" : "";
                System.out.println(message);
            }
        }
    }
    
    public static void matCheckRowNorm(double mat[][], int width, int height) { //JV opet lepsi vracet boolean a vypisovat pak v main
        double rowNorm = 0;
        for (int i = 0; i < 1; i++) { //JV tento for je zbytocny - jen i = 0
            for (int j = 0; j < height; j++) {
                rowNorm += Math.pow(mat[i][j], 2); //JV staci napisat mat[0][j]
            }
        }
        rowNorm = Math.sqrt(rowNorm);
        
        for (int i = 0; i < width; i++) {
            double rowNormCheck = 0;
            for (int j = 0; j < height; j++) {
                rowNormCheck += Math.pow(mat[i][j], 2);
            }
            rowNormCheck = Math.sqrt(rowNormCheck);
            String message = rowNormCheck != rowNorm? "radkove normy nejsou stejne" : "";
            System.out.println(message);
        }
    }
    
}
