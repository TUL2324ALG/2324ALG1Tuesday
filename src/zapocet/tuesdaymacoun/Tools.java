/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package zapocet.tuesdaymacoun;

/**
 *
 * @author Macoun-V-e2a4
 */

public class Tools {
    // Main metoda slozi pouze k testovacim ucelum
    public static void main(String[] args)
    {
        // Zde budu kód testovat (vycházím z předpokladu, že tady stačí testovat metodu tímto způsobem bez scanneru)
        int[] testovaciJednorozmernePole = {1,2,3,452,367,981,3,24};
        int[] testovaciFibonaccihoPole = {0,1,1,2,3,5,8,13,21};
        
        System.out.println(sumThreeDigits(testovaciJednorozmernePole)); // vrati 1800
        System.out.println(isFibonacci(testovaciFibonaccihoPole)); // vrati true
        System.out.println(isFibonacci(testovaciJednorozmernePole)); // vrati false
        
        //1c
        char[][] vlajka = ukraineFlag(6, '#', '*');
        
        for (int i = 0; i < vlajka.length; i++) {
            for (int j = 0; j < vlajka[0].length; j++) {
                System.out.print(vlajka[i][j]);
            }
            System.out.println();
        }
    }
    
    public static int sumThreeDigits(int[] pole)
    {
        // Algoritmus - v cyklu projdu pole čísel, najdu trojciferná a ty sečtu, výslednou sumu vrátím
        
        int suma = 0;
        
        for (int i = 0; i < pole.length; i++) {
            // Jak zjistím, jestli je číslo trojciferné? Vydělím 100 a výsledek bude někde mezi 1-9
            
            //pokud je splněna podmínka jedná se o trojciferné číslo
            if (Math.abs(pole[i]/100) >= 1 && Math.abs(pole[i]/100) <= 9) {
                suma = suma + pole[i];
            }
        }
        
        return suma;
    }
    
    public static boolean isFibonacci(int[] pole)
    {
        for (int i = 0; i < pole.length-2; i++) {
            // debug pro nahlednuti pod poklicku
            // System.out.println(pole[i]+pole[i+1] + " se musi rovnat " + pole[i+2]);
            if (pole[i]+pole[i+1]!=pole[i+2])
            {
                return false;                
            }
        }
        return true;
    }
    
    public static char[][] ukraineFlag(int sirka, char mZ, char zZ)
    {
        char[][] vlajka = new char[sirka][(sirka/2)*3];
        
        // Modry pruh
        for (int i = 0; i < vlajka.length/2; i++) { //radky
            for (int j = 0; j < vlajka[0].length; j++) { //sloupce
                vlajka[i][j] = mZ;
            }
        }
        
        // Zluty pruh
        for (int i = vlajka.length/2; i < vlajka.length; i++) { //radky
            for (int j = 0; j < vlajka[0].length; j++) { //sloupce
                vlajka[i][j] = zZ;
            }
        }
        
        return vlajka;
    }
}
