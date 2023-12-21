package zapocet.tuesdayMoravec;

/**
 *
 * @author Moravec-L-30cc
 */
public class Tools {

    public static void main(String[] args) {
        // testy pro funkce
        int[] t1 = {1, 2, 3, 400, 100, 23, 999, 55, 11};
        var r1 = Tools.sumThreeDigits(t1); // OK 1499

        int[] t2 = {1, 2, 100, -200, -30, 900, -1000};
        var r2 = Tools.sumThreeDigits(t2); // OK 800

        int[] t3 = {0, 0, 1, 2, 3, 5, 8, 13, 21}; //JV melo by byt 0, 1, 1 ne 0, 0, 1
        var r3 = Tools.isFibonacci(t3); // OK true

        int[] t4 = {0, 0, 1, 2, 3, 5, 9, 13, 21};
        var r4 = Tools.isFibonacci(t4); // OK false

        System.out.println(); // jenom pro break-point
    }

    // sečte všechna trojciferná čísla (kladná i záporná) v poli
    // předpokladaný vstup: pole např. [1, 2, 100, -200, 30, 900, -1000] => 800
    public static int sumThreeDigits(int[] a) {
        int sum = 0;

        // projde pole a prvky odpovídající podmínce sečte
        for (int num : a) {
            if ((num >= 100 && num < 1000) || (num <= -100 && num > -1000)) {
                sum += num;
            }
        }
        return sum;
    }

    public static boolean isFibonacci(int[] a) {
        boolean result = true;

        // zkontroluje zda první dva elementy pole odpovídají předpokladu
        if (a[0] != 0 || a[1] != 1) {
            return false;
        }

        // začne procházet posloupnost přičemž porovnává Fibonacciho podmínku
        for (int i = 2; i < a.length; i++) {
            if (a[i - 2] + a[i - 1] != a[i]) {
                return false;
            }
        }
        return result;
    }

    // předpokladaný vstup: vSize = sudé celé číslo
    public static char[][] ukraineFlag(int vSize, char blue, char yellow) {
        char[][] flag = new char[vSize][(int) (vSize * 1.5)];
        // naplnění první poloviny pole modrou barvou
        for (int i = 0; i < flag.length / 2; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = blue;
            }
        }

        // naplnění druhé poloviny pole žlutou barvou
        for (int i = flag.length / 2; i < flag.length; i++) {
            for (int j = 0; j < flag[i].length; j++) {
                flag[i][j] = yellow;
            }
        }

        return flag;
    }
}
