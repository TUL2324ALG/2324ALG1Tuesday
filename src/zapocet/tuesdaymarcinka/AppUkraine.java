
package zapocet.tuesdaymarcinka;
import java.util.Scanner;

public class AppUkraine {

    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Zadejte  první znak");
          String a = sc.next();
         
          System.out.println("Zadejte  druhý znak");
         String b = sc.next();
        
          System.out.println("Zadejte  výšku");
          int c = sc.nextInt();
         Tools.ukraineFlag(c, a, b);
                  }
 
    
   
    
}
