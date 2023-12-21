package zapocet.tuesdayMoravec;

import java.util.Scanner;

/**
 *
 * @author Moravec-L-30cc
 */
public class RowNorms {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("autor: Lukáš Moravec FM TUL ITE");

        System.out.println("Zadejte počet řádků matice:");
        int vSize = sc.nextInt();

        System.out.println("Zadejte počet sloupců matice:");
        int hSize = sc.nextInt();
        sc.nextLine(); // vyprázdnění bufferu

        double[][] matrix = new double[vSize][hSize];
        boolean isPositive = true; // nevím jak se řekne kladná anglicky :(
        boolean rowNorm = true;
        double[] rowNorms = new double[vSize];

        System.out.println("Zadejte hodnoty matice:");

        // načtení hodnot do matice + kontrola kladnosti
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
                if (matrix[i][j] <= 0) {
                    isPositive = false;
                }
            }
        }
        
        //JV tu by se hodilo otestovat jestli pri nacteni se isPositive zmenilo na false, pokud ano, nemuseli by se testovat normy, rovno skocit na vypis

        // vypočtení jednotlivých řádkových norem
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rowNorms[i] += Math.pow(matrix[i][j], 2);
            }
            rowNorms[i] = Math.sqrt(rowNorms[i]);
        }

        // porovnání řádkových norem
        for (int i = 1; i < rowNorms.length; i++) {
            if (rowNorms[i - 1] != rowNorms[i]) {
                rowNorm = false;
                break;
            }
        }

        System.out.format("Matice obshuje %s a %s všechny řádkové normy stejné. \n",
                (isPositive ? "POUZE KLADNÁ čísla" : "NEJEN KLADNÁ čísla"),
                (rowNorm ? "MÁ" : "NEMÁ"));
    }
}
