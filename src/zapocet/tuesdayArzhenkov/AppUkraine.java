/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuesdayArzhenkov;
import java.util.Scanner;
public class AppUkraine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej sirku(sude cislo) a dva znaky pro barvy: ");
        int Width = sc.nextInt();
        char color1 = sc.next().charAt(0);
        char color2 = sc.next().charAt(0);
        
        if (Width % 2 != 0){
            System.out.println("Jenom sudy cisla!!");
        }
        else{
        Tools.ukraineFlag(Width, color1, color2);
        }
    }
    
}
