/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.opravaopl;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Opl-M-4913
 */
public class Average5K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int volba = 1;

        while (volba == 1) {

            Scanner sc = new Scanner(System.in);
            float mincas = Float.MAX_VALUE;
            float maxcas = Float.MIN_VALUE;
            float cascalc = 0;
            float cascalcfinal = 0;

            //input
            for (int i = 1; i < 11; i++) { //JV vhodne vytvorit si konstantu pro 10
                System.out.println("Zadejte cas " + i + ": ");

                float cas = sc.nextFloat();
                if (cas <= mincas) {        //hledani min
                    mincas = cas;
                } else if (cas >= maxcas) {        //hledani max
                    maxcas = cas;
                }
                cascalc = (cascalc + cas);

            }

            //Main calc
            cascalcfinal = (cascalc - mincas - maxcas);
            //System.out.println(cascalcfinal);
            float avgrun = cascalcfinal / 8 / 5;

            // System.out.println(avgrun);
            System.out.println("1km trva prumerne " + avgrun + " minuty");
            System.out.println("********************");
            System.out.println("1 pro pokracovat, 0 pro konec");
            volba = sc.nextInt();

        }
        System.out.println("Konec");

    }

}
