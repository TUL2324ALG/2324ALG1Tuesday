/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapocet.tuesdayKraus;

/**
 *
 * @author Kraus-J-cc59
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] arr = {100, 250, 10, 99, 8};
        int[] arr2 = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int[] arr3 = {0, 1, 1, 2, 3, 5, 9, 14, 22};
        int[] arr4 = {0, 2};
        System.out.println(Tools.sumThreeDigits(arr));
        System.out.println(Tools.isFibonacci(arr2));
        System.out.println(Tools.isFibonacci(arr3));
        System.out.println(Tools.isFibonacci(arr4));
        Tools.ukraineFlag(6, '#', '*');
    }
    
}
