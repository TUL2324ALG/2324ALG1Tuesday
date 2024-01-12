
package zapocet.opravapytlik;
import java.util.Scanner;

public class RowNorms {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte kolik chcete radku:");
        int n = sc.nextInt();
        System.out.println("Zadejte kolik chcete sloupcu:");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][]numbers = new int[n][m]; 
        int sum=0;
        System.out.println("Zadejte matici cisel:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        printArray(numbers);
        System.out.println("");
        isRowNorm(numbers);
        
        
    }
    public static int[][] printArray (int[][]a){
        for (int i = 0; i < a.length; i++) {
            System.out.println("");
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
        }
        return a;
    } 
    
    public static boolean isRowNorm(int[][] a){
        boolean fact = true;
        double rowNorm=0;
        
        for (int i = 0; i < a.length; i++) {
           
            for (int j = 0; j < a[0].length; j++) {
                if(!(a[i][j]>=0)){ fact = false; break;} //JV vhodnejsi napsat a[i][j] < 0
                 rowNorm = rowNorm + Math.sqrt(a[i][j]);
            if((a[i][j])== rowNorm ) {fact = false;break;}//Podmínka kde bude počítána každá řádková norma a porovnávána s ostatními, 
                           //když i dojde na konec radku tak se spocita norma a pak se poovna s tou dalsi
            }
        }
        return fact;
    }
   
    
}
