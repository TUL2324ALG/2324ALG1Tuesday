package zapocet.opravalubianyi;



import java.util.Scanner ;
public class Average5K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
         int check = 1 ;
        while (check > 0){
            
            System.out.println("Start(press 1) or end ( end = zaporne cislo  )");
            check=sc.nextInt() ;
            if(check < 0){
                break ;
            }
            
            
            //mam tady ,ze nemuzu mapsat drobne cislo a nevim proc ale int funguje 
            System.out.println("Napiste casy deseti treningovych behu na 5 km ");
            float array[] = new float [10] ;  
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextFloat();
                
            }

            
            
            for (int i = 0; i < array.length; i++) { // hledan tady za kolik casu probiha 1km
                array[i] = array[i] / 5 ;    
               
            }
            float maxSpeed = array[0];
            float slowestSpeed = 0;

            
            for (int i = 0; i < array.length; i++) { // tady hledam max a lowest rychlost 
                if(maxSpeed < array[i]){
                    maxSpeed = array[i] ;
                }
                if(slowestSpeed > array[i] && slowestSpeed != maxSpeed ){
                    slowestSpeed = array[i] ;
                       
                }
            }
            float averagetime = 0;
            for (int i = 0; i < array.length; i++) { // dostavam tady prumernu rychlost 
                averagetime += array[i] ;
                
            }
            averagetime = averagetime - maxSpeed - slowestSpeed ;
            averagetime = averagetime / 8 ;
            System.out.println(averagetime + "min");
            
            
            
            
            
            
            
            
        }
        
        
        
        
    }
    
}
