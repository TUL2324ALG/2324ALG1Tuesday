/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.tuesdayprochazka;

/**
 *
 * @author Prochazka-M-f2f9
 */
public class Tools {
    public static int sumThreeDigits(int[] a) {
        int retval = 0;
        
        for(int i = 0; i < a.length; i++) {
            // dají se -999 až -100 také považovat za trojciferná čísla?
            
            /*
            if(a[i] >= -999 && a[i] <= -100
                retval += a[i];
            */
            
            if(a[i] >= 100 && a[i] <= 999)
                retval += a[i];
        }
        
        return retval;
    }
    
    public static boolean isFibonacci(int[] a) {
        if(a.length == 0) return false;
        
        if(a[0] != 0) return false;
        
        if(a.length > 1 && a[1] != 1) return false;
        
        for(int i = 2; i < a.length; i++) {
            if(a[i - 2] + a[i - 1] != a[i])
                return false;
        }
        
        return true;
    }
    
    public static char[][] ukraineFlag(int height, char top, char bottom) {
        int width = height * 3 / 2;
        
        char[][] retval = new char[height][width];
        
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                retval[i][j] = (i >= (height / 2)) ? bottom : top;
            }
        }
        
        return retval;
    }
}
