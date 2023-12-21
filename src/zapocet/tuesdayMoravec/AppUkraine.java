package zapocet.tuesdayMoravec;

import java.util.Scanner;

/**
 *
 * @author Moravec-L-30cc
 */
public class AppUkraine {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Introduction
        System.out.println("autor: Lukáš Moravec FM TUL ITE");
        System.out.println("Tento program tiskne ukrajinskou vlajku za pomoci ASCII art.");

        // jako oddelovač se považuje mezera
        System.out.println("Zadejte parametry pro vlajku (výška | znak modré barvy | znak žluté barvy):"); //JV idealne napsat uzivateli, aby zadal sude cislo
        int vSize = sc.nextInt();
        char charBlue = sc.next().charAt(0);
        char charYellow = sc.next().charAt(0);
        sc.nextLine(); // vyprázdnění bufferu

        var flag = Tools.ukraineFlag(vSize, charBlue, charYellow);

        //vykreslení vlajky
        for (int i = 0; i < flag.length; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                System.out.print(flag[i][j]);
            }
            System.out.println();
        }

    }

}
