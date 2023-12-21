/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuesdaykupec;

import java.util.Scanner;
import static tuesdaykupec.Tools.ukraineFlag;

/**
 *
 * @author Kupec-V-0df7
 */
public class AppUkraine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //JV hodil by se popis pro uzivatele
        //input
        int sirka_vlajky = sc.nextInt();
        String barva1 = sc.next();
        String barva2 = sc.next();

        //proccesing
        String flag[][] = ukraineFlag(sirka_vlajky, barva1, barva2);

        //output
        matrixOutput(flag);
    }

    public static void matrixOutput(char[][] a) {
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                System.out.print(a[x][y] + " ");

            }
            System.out.println("");
            //System.out.println(""); - ze zadání jsem pochopil že chcete mezeru i mezi řádky
        }
    }

    public static void matrixOutput(String[][] a) {
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                System.out.print(a[x][y] + " ");

            }
            System.out.println("");
            //System.out.println(""); - ze zadání jsem pochopil že chcete mezeru i mezi řádky
        }
    }

}
