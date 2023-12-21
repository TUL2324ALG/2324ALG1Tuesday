/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapocet.tuesdaylubianyi;

/**
 *
 * @author Lubianyi-A-7848
 */

public class RowNorms {
     public static void main(String[] args) {
        int hodnota = 18;
        int colt = hodnota / 2 ;
        int row = hodnota / 2 ;
        int [][] flag = new int [row][colt] ;
         for (int i = 0; i < flag.length; i++) {
             if(i < 3){
                 System.out.print("#");
             }else{
                 System.out.println("");
                 System.out.print("*");
             }
             
         }
     }
}
