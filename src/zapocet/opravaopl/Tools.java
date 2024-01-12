/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.opravaopl;

/**
 *
 * @author Opl-M-4913
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tools.createOneMatrix(5);
    }
     
        
        
// TODO code application logic here
    
    
    public void areSameArrays() {
        
    }
    
    public static int[][] createOneMatrix(int n) {
       int[][] matrix;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i)
                {
                    matrix[i][j] = 1;
                }
                else 
                    matrix[i][j] = 0;
            
                }
        
         }
        return matrix;
    }
}
