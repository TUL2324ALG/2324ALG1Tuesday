/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.tuesdaypytlik;
import java.util.Scanner;
import java.util.*; //Nemohu si presne vzpomenout jak je knihovna Math tak importuju vsechny
/**
 *
 * @author Pytlik-J-549c
 */
public class RowNorms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte svou vlastni ctevrcovou matici pouze kladnych a realnych cisel:");
        System.out.println("Zadejte vysku:");
        int v= sc.nextInt();
        System.out.println("Zadejte sirku:");
        int s=sc.nextInt();
        System.out.println("Nyni vase cisla po radcich:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < s; j++) {
                int [i][j] a = sc.nextInt(); //Nemohu si vzpomenout jak ulozit do pole nacitane hodnoty od uzivatele 
                //Zde by byla promenna s nazvem Norm do ktere by se ukladali hodnoty zadavane do matice
                double Norm = a[][];
                //Zde by byla podminka ternarniho operatori s promennou isNorm kde by probihal vypocet Normy matice poze v radcich
                //takze a.lenght protoze se pohybujeme v indexu i
                double isNorm = Math.sqrt("pow(hodnota Norm[0][0],2) + pow(hodnota Norm[0][1],2)+ pow(hodnota Norm[0][2],2)...pow(a.lenght-1,2)"  )
                //a pote to same co o radek vyse pro druhy radek tudiz pouze zmenene indexy
               
                //vypis
                        
                
            }
            
            
        }
        
        
    }
    
}
