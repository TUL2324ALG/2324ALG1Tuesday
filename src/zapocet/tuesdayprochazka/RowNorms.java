/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package zapocet.tuesdayprochazka;
import java.util.Scanner;

/**
 *
 * @author Prochazka-M-f2f9
 */
public class RowNorms {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        double[][] m = readMatrix(sc);
        
        verifyMatrix(m);
        
        System.out.printf("Zadali jste matici %dx%d:\n", m[0].length, m.length);
        printMatrix(m);
        System.out.println();
        
        System.out.printf("Matice %s požadavky.\n", checkRowNorms(m) ? "splňuje" : "nesplňuje");
    }

    public static boolean checkRowNorms(double[][] m) {
        boolean success = true;
        
        double oldnorm = 0;
        
        for(int y = 0; y < m.length && success; y++) {
            double norm = 0;
            
            for(int x = 0; x < m[y].length && success; x++) {
                if(m[y][x] <= 0) {
                    System.out.printf("*** Matice obsahuje nekladné číslo (řádek %d, sloupec %d: %f).\n", y + 1, x + 1, m[y][x]); //JV nevypisujte v metode
                    success = false;
                }
                
                norm += Math.pow(m[y][x], 2);
            }
            
            norm = Math.sqrt(norm); // technicky by šlo vynechat, až na to, že tu hodnotu při chybě níže vypisuji
            
            if(success && y != 0 && oldnorm != norm) {
                System.out.printf("*** Řádky matice %d a %d mají rozdílnou normu (%f a %f).\n", y, y + 1, oldnorm, norm);
                success = false;
            }
            
            oldnorm = norm;
        }

        return success;
    }
    
    public static double[][] readMatrix(Scanner sc) {
        System.out.println("Prosím zadejte matici. Čísla oddělujte mezerami a novými řádky, pro ukončení zápisu zadejte prázdný řádek.");
        
        double[][] retval = new double[0][];
        
        while(true) {
            String line = sc.nextLine();
            
            if(line.equals("")) break;
            
            String[] inline = line.split(" ");
            double[] outline = new double[inline.length];
            
            try {
                for(int i = 0; i < inline.length; i++) {
                    outline[i] = Double.valueOf(inline[i]);
                }
            } catch(Exception e) {
                System.out.println("Neplatný vstup. Zadávejte prosím pouze reálná čísla oddělená jednou mezerou.");
                continue;
            }
            
            // Vytvořit nové 2D pole, zkopírovat všechny staré řádky do nového a přidat řádek
            
            double[][] newmatrix = new double[retval.length + 1][];
            
            for(int i = 0; i < retval.length; i++) {
                newmatrix[i] = retval[i];
            }
            
            newmatrix[retval.length] = outline;
            
            retval = newmatrix;
        }
        
        return retval;
    }
    
    public static void printMatrix(double[][] mat) throws Exception {
        for(int y = 0; y < mat.length; y++) {
            for(int x = 0; x < mat[y].length; x++) {
                System.out.printf("% 10f ", mat[y][x]);
            }
            
            System.out.println();
        }
    }
    
    public static void verifyMatrix(double[][] mat) throws Exception {
        if(mat.length == 0) throw new Exception("Matice neobsahuje žádné prvky.");
        
        if(mat.length >= 2) for(int i = 0; i < mat.length - 1; i++) {
            if(mat[i].length == 0)
                throw new Exception("Matice obsahuje prázdný řádek.");
            
            if(mat[i].length != mat[i + 1].length)
                throw new Exception("Matice obsahuje řádky o různých délkách.");
        }
    }
}
