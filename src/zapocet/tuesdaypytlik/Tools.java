/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.tuesdaypytlik;

import java.util.*;
/**
 *
 * @author Pytlik-J-549c
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[]a = {123,158,460}; 
    int[]b = {0,1,1,2,3,5};
        System.out.println(""+sumThreeDigits(a));
        System.out.println(""+isFibonacci(b));
        //test
    int[][] t = {{},{}};
    int size = 6;
    char znak1 ='#';
    char znak2='*';
        
    }
    
       public static int sumThreeDigits(int[] a){
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            //JV jen pokud jsou trojciferna
            sum+=a[i];
            
            //kontroluje přes vsechny prvky a pridava jejich hodnotu do promenne sum
               } return sum;
    }
    
    
    public static boolean isFibonacci(int[] b){
        
        //JV pattern pouzivany pri testech - zacinam true, testuju na podminku (většinou opačnou, jako je v zadani),
        //ktera, kdyz je splnena, dam false a ukoncim testovani. Pokud neni ani jednou splnena zustava true 
        boolean isFib = false;//nastavim puvodni hodnotu na false
        
        //Napisu for cyklus ktery bude kontrolovat zdali zadaná promena je souctem predchozich dvou indexu
        
        for (int i = 0; i < b.length; i++) {
           if(i==0 || i==1) {continue;}
           if(b[i]==(b[i-1]+b[i-2])){ //JV ted staci, aby toto platilo u poslednych trech cisel a vrati vam to true
               isFib=true;
           }
           else{isFib=false;}
           //Pokud se tento index rovna souctu predchozim dvou indexu tak je to Fibonacciho posloupnost
            
        }return isFib;
        
    }
    public static int[][] ukraineFlag(int size,char znak2,char znak1){
        
        //Napisu for cykly pro prochazeni 2D poli
        for (int i = 0; i < size; i++) {//Sirka vlajky
            for (int j = 0; j < ((0.5*size) + size); j++) {//2:3 velikost
                 int[][] t ;//Nemohu si vzpomenout jak ulozit vysledek cyklů do promenne tudiz ji nemohu tisknout //JV tat metoda nemela nic tisknout, jen ulozit znaky do pole
                //ale byl by zde napsany vypis v podobne forme jako:
                //System.out.print(" " + t[i]);
                //System.out.println(" " + t[j]);
            }
            
      //  AppUkraine.java (viz in package)
               
        }
        
    } return [a][b]; 
}
