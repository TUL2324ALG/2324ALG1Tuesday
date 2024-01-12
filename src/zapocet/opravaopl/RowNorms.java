/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.opravaopl;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Opl-M-4913
 */
public class RowNorms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej romery matice x y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean negative = false;
        
        double[][] matrix = null;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Zadej hodnotu : ");
                matrix[i][j] = sc.nextDouble();
                if (-1 == Math.signum(matrix[i][j])) {
                   // System.out.println("negativni cislo");
                    negative = true;
                }
               
            
                        
                

            }

        }
        
        System.out.println("************");
        if (negative == true)
            System.out.println("V matici se nachazi negativni cislo");
        else System.out.println("Matice je kladna");
        
        
        

    }

}
