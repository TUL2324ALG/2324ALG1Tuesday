/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdayopl;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Opl-M-4913
 */
public class Tools {

    tuesdayopl.Tools.isFibonacci()

    public static void ukraineFlag(x,char1,char2) {
        
        double y = 0;
        y = Math.round(x/3*2);
        
        
        
    }

    public static void sumThreeDigits([]) {
        
        int a = 0;
        int total = 0;
        for (int i = 0; i < a[i]; i++) { //JV trojciferna cisla muzou byt i zaporna
            if (a >= 100 & a < 1000) {
                total = total + a;
            }
        }
        return total;
    }

    public static void isFibonacci([]) { //JV ma brat pole a, vracet boolean - je to test nejaky vlastnosti
        int x = 0;
        int x1 = 0;
        int x2 = 0;
        boolean fib = false; //JV zacnete na true
        for (int i = 3; i < a.length; i++) { //JV i by melo zacinat od 2 
            x = a[i];
            x1 = a[i - 1];
            x2 = a[i - 2];

            if ((x - x1) == x2) { //JV trochu zbytečné zavedeni promennych, jen komplikuje citelnost kodu a[i] - a[i-1] == a[i-2] by bylo srozumitelnejsi
                                  //JV a[i-2] + a[i-1] == a[i] by bylo nejsrozumitelnejsi
                fib = true; //JV kdyz zacnete na true nemusite porad nastavovat v cyklu na true
            } else {
                fib = false;
                break;
            }

        }
        //JV pattern pouzivany pri testech - zacinam true, testuju na podminku, ktera, kdyz je splnena, dam false a ukoncim testovani 
        if (fib == false) {
            System.out.println("Nejedna se o fibonacio posloupnost");
        } else {
            System.out.println("Jedna se o fibonacio posloupnost");
        }

        return fib;
    }

}
