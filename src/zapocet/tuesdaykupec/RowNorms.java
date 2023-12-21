/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.tuesdaykupec;

import java.util.Scanner;

/**
 *
 * @author Kupec-V-0df7
 */
public class RowNorms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //double[][] matrix = {{1, 2, 3}, {-2, 2, 3}, {1, 2, 3}}; - pro testovaci ucely

        double[][] matrix = matrixLoader(); //nacitani matice

        //boolean RowNorms = ((checkMatrixPositivity(matrix) && isMatrixNormed(matrix)) == true);  //doufam ze toto je ternarni operator
        boolean RowNorms; //JV nechte si poradit Netbeans, jak tohle napsat lip
        if ((checkMatrixPositivity(matrix) && isMatrixNormed(matrix)) == true) { //JV nechte si poradit Netbeans, jak tohle napsat lip
            RowNorms = true;
        } else {
            RowNorms = false;
        }
        
    }

    public static double[][] matrixLoader() { //jen nacitani matice
        Scanner sc = new Scanner(System.in);
        System.out.println("zadej rozmery matice");
        int m = sc.nextInt();
        int n = sc.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("nyni zadavej hodnoty matice:");
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = sc.nextDouble();
            }
        }
        return matrix;
    }

    public static boolean checkMatrixPositivity(double[][] a) {
        boolean fact = true;
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                if (a[x][y] < 0) {
                    fact = false;
                    break; //JV pozor break ukonci jen nejblizsi cyklus a vy chcete ukoncit celou metodu
                }
            }
        }
        return fact;
    }

    public static boolean isMatrixNormed(double[][] a) {
        boolean fact = true;
        double[] sum_row = new double[a.length];
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                sum_row[x] += Math.sqrt(a[x][y] * a[x][y]);
            }
        }

        for (int x = 0; x < sum_row.length - 1; x++) { //nemel jsem asi cas to dat do samostatne metody, vim ze by metoda mela delat jednu vec
            if (sum_row[x] != sum_row[x + 1]) {
                fact = false;
                break;
            }
        }
        return fact;
    }
    
    public static boolean areSumsSame(double[] sum_row){
    boolean fact = true; 
         for (int x = 0; x < sum_row.length - 1; x++) {
            if (sum_row[x] != sum_row[x + 1]) {
                fact = false;
                break;
            }
        }
    return fact;
    }

}
