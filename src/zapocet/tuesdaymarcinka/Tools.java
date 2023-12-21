package zapocet.tuesdaymarcinka;


public class Tools {

     public static void main(String[] args) {
               int[] a = {0, 1, 1, 2};
                   System.out.println(sumThreeDigit(a));
                    System.out.println(isFibonacci(a));
        
    }
    
     //JV A
    public static int sumThreeDigit(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
         if(a[i]>99 && a[i] < 1000 || a[i]<-99 && a[i]>-1000)
            sum = sum + a[i];
            
        }
         return sum;
    }
    public static boolean isFibonacci(int[] a){
        if(a[0] == 0){
           if(a[1] == 1){
               for (int i = 2; i < a.length; i++) {
                    if (a[i-2] + a[i-1] == a[i] ){
                return true; //JV !!!test - hledejte opacnou podminku - podle Vaseho kodu staci, aby se a[0] + a[1] == a[2] a už to vrati true
            }
                   
               }
              
        } 
        }
         return false;
    }
     public static String[][] ukraineFlag(int n, String b, String c){
        int m;
        m = n+(n/2);
       String[][] a= new String[m][n];
        for (int i = 0; i < a[0].length/2; i++) {
            for (int j = 0; j < a.length; j++) {
               System.out.print("  " + b);
                
            
            }
                System.out.println(""); //JV nevypisujte, plnte pole a tj. a[i][j] = b 
            }
        for (int i = 0; i < a[0].length/2; i++) {
            for (int j = 0; j < a.length; j++) {
               System.out.print("  " + c);
                
            
            }
                System.out.println("");
            }
       
        return a;
    } 
   
}
