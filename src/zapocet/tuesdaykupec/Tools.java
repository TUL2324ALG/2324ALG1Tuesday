/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuesdaykupec;

/**
 *
 * @author Kupec-V-0df7
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] test = {1, 100, 2, 1001, 109, 1}; //testy
        System.out.println(sumThreeDigits(test));

        double[] test2 = {1, 1, 2, 3, 5}; //testy
        System.out.println(isFibonacci(test2));
    }

    public static double sumThreeDigits(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (((a[i] >= 100) && (a[i] <= 999))||(a[i] <= -100) && (a[i] >= -999)) { //podminky pro trojciferna cisla
                sum += a[i]; //suma
            }
        }
        return sum;
    }

    public static boolean isFibonacci(double[] a) {
        boolean fact = true;
        for (int i = 0; i < a.length - 2; i++) {//JV ještě to chtělo zkontrolvat, že prvni 2 cisla jsou 0 a 1 
            if (a[i] + a[i + 1] != a[i + 2]) { //prosta kontrola fibonacciho posloupnosti
                fact = false;
                break;
            }
        }
        return fact;
    }
    
    public static String[][] ukraineFlag(int delka, String barva_prvni, String barva_druha) {
        String[][] flag = new String[delka][delka+(delka/2)]; //udelam pole z charu
        
        for (int x = 0; x < flag.length; x++) {
            for (int y = 0; y < (flag[x].length); y++) {
                if (x <= (flag.length / 2)) {
                    flag[x][y] = barva_prvni; //jen plnim "barvickama"
                }
                if (x >= (flag.length / 2)) { //JV u jednoho by nemělo byt rovna se, vybarvi prvni barvou, pak prepise druhou
                    flag[x][y] = barva_druha;
                }
            }

        }
        return flag;
    }

    public static char[][] ukraineFlag(int a, char b, char c) { //mam to i pro chary, protoze jsem si vsiml ze scanner nenacita jen chary
        char[][] flag = new char[a][a+(a/2)];
        for (int x = 0; x < flag.length; x++) {
            for (int y = 0; y < (flag[x].length); y++) {
                
                if (x <= (flag.length / 2)) {
                    flag[x][y] = b;
                }
                if (x >= (flag.length / 2)) {
                    flag[x][y] = c;
                }
            }

        }
        return flag;
    }

}
