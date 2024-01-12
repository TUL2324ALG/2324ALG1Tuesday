package zapocet.opravalubianyi;


public class Tools {

    public static void main(String[] args) {
        areSameArrays(); // metoda pro ulohu 1
        createOneMatrix(); // metoda pro ulohu 2

    }

    private static void createOneMatrix() {
        int size = 4; // parametry matice //JV melo by byt jako vstupni parametr
        int array[][] = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) { //heladm tady main diagonale
                    array[i][j] = 1;

                } else { // ostatni nuly
                    array[i][j] = 0;
                }

                System.out.print(array[i][j]); //JV v metodach nevypisovat, ale return array

            }
            System.out.println("");

        }

    }

    private static void areSameArrays() { //JV metoda by mela mit jako vstup 2 pole a vracet boolean
        boolean check = true;
        int array[] = {1, 2, 3, 4}; //2 nahodny pole
        int array2[] = {1, 2, 3, 4};
        int index = 0;
        int count = 0;

        if (array.length == array2.length) { //lontroluju tady rozmer pole aby byli stejny
            for (int i = 0; i < array2.length; i++) {
                if (array[index] == array2[i]) { //hledam tady ,jesli cisla stejne

                    count++;

                }
                index++;

            } //i a index se Vam meni stejne, delate vlastne array[i] == array2[i]
            if (count == array.length) {  // kontroluju tady kolikrat bylo cislo napsane ,jestli vice nez rozmer pole pak poli nejsou stejny
                check = true;
            } else {
                check = false;
            }
        } else {
            check = false;
        }

        System.out.println(check);
        //JV kontroluje to jestli jsou stejne i ve stejnem poradi
    }

}
