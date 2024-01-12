
package zapocet.opravapytlik;
import java.util.Scanner;

public class Average5K {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int times[] = new int[10];
        System.out.println("Chcete pokracovat ? 1 pro ano, 2 pro ne");
        int vyber = sc.nextInt();
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double sum = 0;
        double avg;
        int count=0;
        do{
           if (vyber ==1){
        
         System.out.println("Zadejte svych deseti casu v behu na 5km :");
            double numbers[] = new double[times.length];
            for (int i = 0; i < times.length; i++) {
                numbers[i] = sc.nextDouble();
                if (numbers[i]>=max){max = numbers[i];}
                if (numbers[i]<=min){min = numbers[i];}
               sum = sum + numbers[i];
                       
               count++;
                
            }
            avg=((sum-max-min)/count)*(1/5); // vypocet pro prumer jednoho kilometru1 //JV pozor 1/5 celociselne je 0
            
           
            printArr(numbers);
            System.out.println("");
            System.out.println(avg);
           }
           else {System.out.println("Konec"); break;}
        
        
} while (vyber!=1);
        }
    
    public static double[] printArr(double[]a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " +a[i]);
            
        }
        return a;
    }
}
