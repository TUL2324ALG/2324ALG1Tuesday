/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdaymacoun;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Macoun-V-e2a4
 */
public class RowNorms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadejte pocet radku vasi matice");
        int rows = sc.nextInt();
        
        System.out.println("Zadejte pocet sloupcu vasi matice");
        int columns = sc.nextInt();
        
        while (rows < 0)
        {
            System.out.println("Prosim, zadej kladne mnozstvi radku");
            rows = sc.nextInt();
        }
        
        while (columns < 0)
        {
            System.out.println("Prosim, zadej kladne mnozstvi sloupcu");
            rows = sc.nextInt();
        }
        
        // Inicializace matice
        double[][] matice = new double[rows][columns];
        
        
        for (int i = 0; i < matice.length; i++) {
            for (int j = 0; j < matice[0].length; j++) {
                System.out.println("Zadej hodnotu matice na indexu " + i + "," + j);
                matice[i][j] = sc.nextDouble();
            }
        }
        
        // **Neni mi jasne, proc kontrolovat, jestli matice obsahuje pouze kladna cisla - to mohu osetrit uz v loopu nad timto komentarem
        // **mohl bych tam dat while a sikanovat uzivatele, dokud to kladne cislo nezada, nebo udelat absolutni hodnotu..
        
        // Na ternarni operator :( si nevzpomenu, ale bylo to nejak takhle, prvni hodnota byla pro true, druha pro false (jsem zkazen javascriptem)
        // System.out.println(kladneHodnotyMatice(matice) ?? "Hodnoty jsou kladne" : "Hodnoty jsou zaporne"); //JV ok jen s jednim otaznikem
        
        // Zjisteni, jestli jsou vsechny hodnoty kladne
        if (kladneHodnotyMatice(matice))
        {
            System.out.println("Hodnoty matice jsou kladné!");
        }
        else
        {
            System.out.println("Některé hodnoty matice jsou záporné. :(");
        }
        
        // Zjisteni, jestli maji vsetky radky stejnou normu
        if (areRowNormsEqual(matice))
        {
            System.out.println("Řádkové normy matice jsou stejné!");
        }
        else
        {
            System.out.println("Řádkové normy matice nejsou stejné. :(");
        }
        
        System.out.println(Arrays.deepToString(matice)); // rychlovypis pro prehled
    }
    
    public static boolean kladneHodnotyMatice(double[][] mat)
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] < 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean areRowNormsEqual(double[][] mat)
    {
        double norma = 0;
        
        // dve smycky - jedna pro prochazeni radku a druha pro prochazeni hodnot na radku
        // projdi radek, jdi na dalsi radek, projdi radek...
        for (int i = 0; i < mat.length; i++) {
            double rowMemory = 0;
            for (int j = 0; j < mat[0].length; j++) {
                rowMemory = rowMemory + Math.pow(mat[i][j], 2);
            }
            if (norma == 0)
            {
                norma = Math.sqrt(rowMemory);
            }
            else
            {
                // Porovnej normy
                if (norma != Math.sqrt(rowMemory)) // jestli se nerovnaji, nejsou stejne
                {
                    return false;
                }
            }
            
            // Uvolni pamet pro novy radek
            rowMemory = 0;
        }
        
        // pokud program dobehl az sem, je vsechno ok
        return true;
    }
}
