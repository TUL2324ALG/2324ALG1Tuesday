/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdaypanek;

import java.util.Scanner;

/**
 *
 * @author Panek-J-d39d
 */
public class AppUkraine {
    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);
        //Get flag rows
        System.out.println("Zadejte počet řádků vlajky: ");
        int rows = scanner.nextInt();
        scanner.nextLine();
        
        // Get flag characters
        System.out.println("Zadejte znak pro horní část vlajky: ");
        char topChar = scanner.nextLine().charAt(0);
        System.out.println("Zadejte znak pro spodní část vlajky: ");
        char bottomChar = scanner.nextLine().charAt(0);
        
        char[][] flag = Tools.ukraineFlag(rows, topChar, bottomChar);
        
        // Print flag using helper class
        Tools.printMatrix(flag);
    }
}
