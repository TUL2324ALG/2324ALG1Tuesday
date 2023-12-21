/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.tuesdayArzhenkov;

public class Tools {

    public static void main(String[] args) {
        int[] array = {1, 999, 322, 5};
        System.out.println("sum: " + sumThreeDigits(array));
        System.out.println("Fibonacci? " + isFibonacci(array));

        int height = 6;
        char color1 = '#';
        char color2 = '*';
        ukraineFlag(height, color1, color2);

    }

    public static int sumThreeDigits(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 100 && array[i] <= 999) { //JV muzou byt i zaporne cisla
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean isFibonacci(int[] array) {
        boolean Fibonacci = true;
        for (int i = 2; i < array.length; i++) {
            if (array[i - 2] + array[i - 1] != array[i]) {
                Fibonacci = false; //JV kdyz se jednou nerovna, ukoncit cyklus
            }
        }
        return Fibonacci;
    }

    public static void ukraineFlag(int height, char color1, char color2) { //JV mela to ulozit do 2D pole
        int width = (height / 2 * 3);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i <= (height / 2 - 1)) {
                    System.out.print(color1);
                } else {
                    System.out.print(color2);
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

}
