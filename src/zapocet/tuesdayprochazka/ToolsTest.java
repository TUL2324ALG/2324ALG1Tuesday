/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdayprochazka;

/**
 *
 * @author Prochazka-M-f2f9
 */
public class ToolsTest {
    public static void main(String[] args) {
        int[] atestarr = { 1, 2, 3, 100, 999, 1000, 401, -123 };
        
        int a1 = Tools.sumThreeDigits(atestarr);
        int a2 = 100 + 999 + 401;
        
        System.out.printf("Zkouška funkce sčítání trojciferných čísel\n");
        System.out.printf("  Funkce vrátila: %d\n", a1);
        System.out.printf("  Očekávaný výsledek: %d\n", a2);
        
        System.out.printf("  -> Test %s\n\n", (a1 == a2) ? "uspěl" : "neuspěl");
        
        int[][] btestarr = {
            { 0, 1, 1, 2, 3, 5, 8, 13, 21, 13 + 21 },
            {},
            { 0 },
            { 0, 1 },
            { 0, 1, 1, 2, 3, 5, 8, 13, 21, 13 + 22 },
        };
        
        boolean[] bexpected = { true, false, true, true, false };
        
        System.out.printf("Zkouška funkce kontroly Fibonacciho posloupnosti\n");
        
        for(int i = 0; i < btestarr.length; i++) {
            boolean b1 = Tools.isFibonacci(btestarr[i]);
            boolean b2 = bexpected[i];
            
            System.out.printf("  Funkce vrátila: %s\n", b1 ? "ano" : "ne");
            System.out.printf("  Očekávaný výsledek: %s\n", b2 ? "ano" : "ne");

            System.out.printf("  -> Test %d %s\n\n", i + 1, (b1 == b2) ? "uspěl" : "neuspěl");
        }
        
        // metodu ukraineFlag zde testovat nemusím, vizte AppUkraine.java
    }
}
