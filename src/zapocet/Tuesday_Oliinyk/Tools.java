
package zapocet.Tuesday_Oliinyk;

import java.util.Scanner;

/**
 *
 * @author Oliinyk-O-9786
 */
public class Tools {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int[] a = {123, 1, 21, 100};
        System.out.println(sumThreeeDigits(a));
    int[] p = {100,1,1,1,1,1,20,100,200,999,101};
        System.out.println(sumThreeeDigits(p));
    int[] test = {0,1,1,2,3};
        System.out.println(isFibonacci(test));
    int[] test1 = {0,1,1,1,1};
        System.out.println(isFibonacci(test1));
    
    }
    

    public static int sumThreeeDigits(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=100 && a[i]<=999){ //JV trojciferna cisla muzou byt i zaporna
                sum += a[i];
            }
            
        }
        return sum;

    }
    
    public static boolean isFibonacci(int[] test){
        boolean statement = true;
        for (int i = 0; i < test.length-2; i++) {
           int expectedSum = test[i+2];
           int realSum = test[i] + test[i+1];
           if(expectedSum != realSum){
               return false;
           }
        }
        return statement;
    }
    
    public static void ukraineFlag(Scanner sc, String a, String b){ //JV metoda mela vyplnit 2D pole
        System.out.println("Zadejte sirku vlajky: ");
        int sirka = sc.nextInt();
        int delka = (3*sirka)/2;
        int[][] flag = new int[sirka][delka];
            for (int j = 0; j < sirka/2; j++) {
                for (int k = 0; k < delka; k++) {   
                    System.out.print(a + "  ");
                }
                System.out.println("");
            }
            for (int j = 0; j < sirka/2; j++) {
                for (int k = 0; k < delka; k++) {   
                    System.out.print(b + "  ");
                }
                System.out.println("");
            }
            
    }
    
}  