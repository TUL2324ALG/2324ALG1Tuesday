
package zapocet.tuesdaylubianyi;


public class isFibonacci {
    public static void main(String[] args) {
     int [] a = new int [15];
     
     a[0] = 0;
     a[1] = 1;
    
     
        
        for (int i = 0; i < a.length - 1; i++) {
             int newNum;
            newNum = a[i] + a[i + 1] ;
                
                a[i + 1] = newNum ; //JV pri testovani si nechcete prepisovat hodnoty v testovanem poli
            
    }
        for (int i = 0; i < a.length; i++) {
            System.out.print( a[i] +"");
            
        }
   
       
    }
    
}
