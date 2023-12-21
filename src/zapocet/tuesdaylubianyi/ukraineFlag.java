
package zapocet.tuesdaylubianyi;
import java.util.Scanner ;

//JV vlajku to nekresli
public class ukraineFlag {
    public static void main(String[] args) {
        //Scanner scanner = new scanner(System.in) ;
        int hodnota = 18;
        int colt = hodnota / 2 ;
        int row = hodnota / 2 ;
        int [][] flag = new int [row][colt] ;
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag[0].length; j++) {
                if(i > 2){
                    flag[i][j] = 1 ;
                }else{
                    flag[i][j] = 2 ;
                }
                
                
            }
            
        }
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag[0].length; j++) {
                if(flag[i][j] == 1){
                    System.out.print("#");
                    System.out.println("");
                }else {
                    System.out.print("*");
                }
                
            }
            
        }
    }
}
