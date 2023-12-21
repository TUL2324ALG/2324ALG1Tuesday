package zapocet.tuesdaylubianyi;


public class ToolsJava {
    public static void main(String[] args) {
        int [] nums = new int[10];
        double [] test = {122,334,5,6};   
        nums[0] = 0;
        nums[1] = 1;
        int [] result = isFibonacci(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print( result[i] +"");
            
        }
        System.out.println("");
        double res = 0;
       //s = sumTrhreedigits(test);
       
    }
     public static int[] isFibonacci(int [] a){
      int[] arrrayNew = new int [7] ;   //JV velikost noveho pole zalezi od velikosti a
      int newNum;
     arrrayNew[0] = 0;
     arrrayNew[1] = 1;
    
     
        
        for (int i = 0; i < arrrayNew.length - 1; i++) {
            newNum = arrrayNew[i] + arrrayNew[i + 1] ; //JV chtelo to secist a[i - 2] + a[i - 1] a vvlozit do arrayNew[i];
            
                a[i] = newNum; 
            
    }
        
            
        
        return a;
     }
     public static double[] sumTrhreedigits( double[] test){
         
         double check;
         double sum = 0;
        
         for (int i = 0; i < test.length; i++) {
              check = test[i] / 100 ; 
             if(check < 0){ 
                 sum += 0 ;
             } //JV check by mel byt mezi 1 a 9   321/100 = 3, 3210/100 = 32 uz neni trojciferne
             else{
                 sum = test[i]  + sum ;
             }
         } //JV stacilo vratit sumu
         for (int i = 0; i < test.length; i++) {
             System.out.println( test +"");
            
        }
         return test;
     }

   
}
  
