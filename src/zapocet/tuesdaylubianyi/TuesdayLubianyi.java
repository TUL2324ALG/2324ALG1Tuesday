
package zapocet.tuesdaylubianyi;


public class TuesdayLubianyi {

 
    public static void main(String[] args) {
         double [] test = {122,334,5,6};
         double check;
         double sum = 0;
        
         for (int i = 0; i < test.length; i++) {
              check = test[i] / 100 ;
             if(check < 0){
                 sum += 0 ;
             }
             else{
                 sum = test[i]  + sum ;
             }
         }
         for (int i = 0; i < test.length; i++) {
             System.out.println( test +"");
            
        }
    }
    
}
