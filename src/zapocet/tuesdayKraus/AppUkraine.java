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
public class AppUkraine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("zadej sirku");
        int width = sc.nextInt();
        
        System.out.println("zadej prvni znak");
        String symbolString = sc.next();
        char symbol = symbolString.charAt(0);
        
        System.out.println("zadej druhy znak");
        String symbolString2 = sc.next();
        char symbol2 = symbolString2.charAt(0);
        
        
        char[][] mat = Tools.ukraineFlag(width, symbol, symbol2);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    
}
