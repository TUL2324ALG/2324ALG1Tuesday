/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuesdaypytlik;

import java.util.Scanner;
/**
 *
 * @author Pytlik-J-549c
 */
public class AppUkraine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte sirku(Musi byt sude cislo):");
       int size = sc.nextInt();
       if(size%2==0)
       {
           System.out.println("Zadejte 2 znaky jako barvy:");
           System.out.println("Pro modrou barvu:");
           char znak1 = sc.nextChar.lowerCase(); // Nevím jak Scannerovat char //JV sc.next().charAt(0)
           System.out.println("Pro zlutou barvu:");
           char znak2 = sc.nextChar.lowerCase(); // Nevím jak Scannerovat char
           System.out.println(""+ukraineFlag(size,char znak1,char znak2));
           
       }
       else{System.out.println("Sirka musi byt suda.");}
    }
    
}
