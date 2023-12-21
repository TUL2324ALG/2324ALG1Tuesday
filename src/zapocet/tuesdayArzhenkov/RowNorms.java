/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.tuesdayArzhenkov;
import java.util.Scanner;
public class RowNorms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej pocet radku: ");
        int radky =  sc.nextInt();
        System.out.print("Zadej pocet sloubcu: ");
        int stolb =  sc.nextInt();
        
        int[][] matrix = new int[radky][stolb];
        
        System.out.print("Zadej prvky matice: ");
        
        for (int i = 0; i < radky; i++){
            for (int j = 0; j < stolb; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        
        boolean Plus = true;
        for (int i = 0; i < radky; i++){
            for (int j = 0; j < stolb; j++){
                if (matrix[i][j] <= 0){
                    Plus = false;
                }
            }
        }
        if (Plus = false){
            System.out.println("Jenom kladni cisla");
        }
        else{
                        
        }
    }
    
    public static int Norm() {
}
