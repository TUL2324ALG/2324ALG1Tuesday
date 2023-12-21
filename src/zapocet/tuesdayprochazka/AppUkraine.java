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
public class AppUkraine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Zadejte výšku vlajky: ");
        int height = Integer.valueOf(sc.nextLine());
        
        System.out.print("Zadejte znak na horní polovinu vlajky: ");
        char top = sc.nextLine().charAt(0);
        
        System.out.print("Zadejte znak na dolní polovinu vlajky: ");
        char bottom = sc.nextLine().charAt(0);
        
        char[][] flag = Tools.ukraineFlag(height, top, bottom);
        
        for(int y = 0; y < flag.length; y++) {
            for(int x = 0; x < flag[y].length; x++) {
                System.out.printf("%c ", flag[y][x]);
            }
            
            System.out.println();
        }
    }
}
