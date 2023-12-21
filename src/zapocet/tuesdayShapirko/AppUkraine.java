/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdayShapirko;

import java.util.Scanner;
import static zapocet.tuesdayShapirko.Tools.*;

/**
 *
 * @author Shapirko-O-870a
 */
public class AppUkraine {
    static Scanner scanner = new Scanner(System.in);
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter width of flag please: ");
        int width = scanner.nextInt();
        
        if (width % 2 != 0) return; //new Exception("Incorrect input!");
        
        scanner = new Scanner(System.in);
        System.out.print("Enter char for top of the flag please: ");
        String top = scanner.nextLine();//.charAt(0); 
        
        scanner = new Scanner(System.in);
        System.out.print("Enter char for bottom of the flag please: ");
        String bottom = scanner.nextLine();//.charAt(0); 
        
        printMatrix(ukraineFlag(width, top.charAt(0), bottom.charAt(0)));
    }
}
