
package zapocet.tuesdaymarcinka;

import java.util.Scanner;

public class RowNorms {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      
         System.out.println("Zadejte rozměry matice");
        int a = sc.nextInt();
       int  b = sc.nextInt();
        System.out.println("Zadejte prvky matice");
       int [][] a = loadArray(Scanner sc, a, b); //JV pri volani metody se uz nespecifikuje datovy typ, to ze sc je typu Scanner uz mate na radku 7 
        System.out.println(""+testMatrix(a)); //JV uzivateli hezky vypsat, ne jenom true/false
    }

    public static int[][] loadArray( Scanner sc, int i,  int j) {
        int[][] a = new int[i][j];
        for (int k = 0; k < a.length; k++) {
            for (int l = 0; l < a.length; l++) {
                a[k][l] = sc.nextInt();
                
            }
            
        }
        return a;
    }

    

public static boolean testMatrix(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] < 0) {
                    return false;
                } 
            }
          for (int k = 0; k < a.length; k++) {
            for (int j = 0; j < a[0].length; j++) {
                sum =+ (a[k][j]*a[k][j]); //JV nasobit bylo potreba cisla na stejnych indexech
              //zaznamená si kadé sumy každého řádku do jednotlivých proměných a pak porovnáná odmocnin proměných pro každý řádek.

            }
  
            //JV dokoncit
                    
            
            
        }
           
            
       return true;
//        return sum;

        }
        
    }


