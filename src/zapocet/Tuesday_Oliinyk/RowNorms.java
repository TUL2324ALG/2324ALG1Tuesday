
package zapocet.Tuesday_Oliinyk;

import java.util.Scanner;


public class RowNorms {

//jeste neumim nekdy volat methody :0
    // there is nothing we can do
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[][] a = new int[][];
        //System.out.println(readMatrix(sc, a));
        
        //JV 
        //int[][] a = readMatrix(sc);
        //boolean isPositiveSameRowNorms = normMatrix(a);
    }
    
    public static int[][] readMatrix(Scanner sc, int[][] a){ //JV neni potreba vstupny parameter typu pole
        System.out.println("Zadej pocet radku: ");
        int rows = sc.nextInt();
        System.out.println("Zadej pocet sloupcu: ");
        int cols = sc.nextInt();
        System.out.println("Zadej prvky matice: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }  
        }
        return a;
    }
    
    public static boolean normMatrix(Scanner sc, int[][] a){
        boolean state = true;
        readMatrix(sc, a);
        double norma = 0;
        for (int i = 0; i < a.length-1; i++) {
            norma = 0;
            for (int j = 0; j < a[i].length; j++) {
                //JV na radku je potreba udelat sumu druhych mocnin sum += a[i][j] * a[i][j]
                norma = (Math.sqrt(a[i][j])*Math.sqrt(a[i][j]));  //nejsem jisty zda to bude fungovat :(
                if(a[i][j]<0){
                    return false;
                }
                if(Math.sqrt(norma) != Math.sqrt(norma)){  //presne jeste nevim jak budu to porovnavat
                    return false;
                }
            }
            //JV az po konci radkuudelat odmocninu a skontrolovat na stejnost - vypocitat samostatne normu 0. radku a vsechny ostatni normy porovnávat s ni
        }
        return state;
        /*Teoreticky to jde udelat dalsim zpusobem. Spocitame double norma pro kazdy radek
        , pak uklademe tento double v nejaky array storage ktery si zapamatuje 1.normu,
        pak vynulujeme a spocitame zase ale uz na dalsim radku. //Napad hezky ale nevim a
        nedokazu to naladit za 8 minut :0
        */
    }
    
}
