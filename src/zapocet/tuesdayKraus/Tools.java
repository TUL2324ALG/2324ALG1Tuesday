/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapocet.tuesdayKraus;

import java.util.Scanner;

/**
 *
 * @author Kraus-J-cc59
 */
public class Tools {
    
    
    public static int sumThreeDigits(int[] arr) {
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 99 && arr[i] < 10000) { //JV trojciferna cisla muzou byt i zaporna
                sum += arr[i];
            }
        }
        return sum;
    }
    
    public static boolean isFibonacci(int[] arr) {
        
        if (arr[0] != 0 || arr[1] != 1) {
            return false;
        }
        
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i+1] != arr[i-1] + arr[i]) {
                return false;
            }
        }
        return true;
    }
    
    public static char[][] ukraineFlag(int width, char symbol, char symbol2) {
        int length = width + (width/2);
        char[][] mat = new char[width][length];
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (i < width/2) {
                    mat[i][j] = symbol;
                } else {
                    mat[i][j] = symbol2;
                }
            }
        }
        return mat;
    }
}
