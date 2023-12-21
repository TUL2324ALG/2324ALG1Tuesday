/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.Tuesday_Oliinyk;

import java.util.Scanner;


public class AppUkraine {

    //navazuje na ukraineFlag()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prvni znak: ");
        String a = sc.next();
        System.out.println("Druhy znak: ");
        String b = sc.next();
        Tools.ukraineFlag(sc,a , b);
        
    }
    
}
