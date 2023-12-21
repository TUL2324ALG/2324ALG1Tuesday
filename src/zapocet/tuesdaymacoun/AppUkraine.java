/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdaymacoun;
//import static tuesdaymacoun.Tools.ukraineFlag;
import java.util.Scanner;
import static tuesdaykupec.Tools.ukraineFlag;
/**
 *
 * @author Macoun-V-e2a4
 */

public class AppUkraine {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // UI
        System.out.println("Flag printer app");
        System.out.println("Zadejte sirku: ");
        int sirka = sc.nextInt();
        
        // Osetreni vstupu
        while (sirka < 0 || sirka%2 != 0)
        {
            System.out.println("Nespravne zadana sirka! Zadejte sirku (sude kladne cislo): ");
            sirka = sc.nextInt();
        }
        
        //JV uvaha je spravna sc.next().charAt(0)
        // Tady bych si musel vyhledat, jak prinutim scanner prijmout char
        // Pravdepodobne nacist string a ten prevest na char, ale neni cas na experimenty
        
        // nejak takhle treba
        //char[] znaky = sc.nextLine().toCharArray();
        //char modryZnak = znaky[0];
        
        //System.out.println("Zadejte znak pro horni polovinu vlajky");
        //char modryZnak = 
        //System.out.println("Zadejte znak pro dolni polovinu vlajky");
        //int zlutyZnak = sc.nextInt();
                
        char modryZnak = '#';
        char zlutyZnak = '*';
                
        // Vypocet vlajky
        char[][] vlajka = ukraineFlag(sirka, modryZnak, zlutyZnak);
        
        // Zobrazeni vlajky
        for (int i = 0; i < vlajka.length; i++) {
            for (int j = 0; j < vlajka[0].length; j++) {
                System.out.print(vlajka[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
