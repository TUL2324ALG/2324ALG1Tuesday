
package zapocet.opravapytlik;


public class Tools {

    
    public static void main(String[] args) {
        int n=4;
        int[] test1 = {15,22,35};
        int[] test2 = {22,15,35};
       printArray(createOneMatrix(n));
        System.out.println("");
    }
    
    /*public static boolean areSameArrays(int []a , int[]b){
        boolean fact = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if ()
            }
        }
    }*/
    
    public static int[][] createOneMatrix(int n){
        int [][]matr = new int[n][n];
        int [][]newArr = new int[matr.length][matr[0].length];//JV stacilo primo plnit matr, neni potreba vytvaret dalsi pole
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                if (i == j) {
                    newArr[i][j] = 1;}
                else{newArr[i][j]=0;}//Sice Java sama zadá 0 pokud tam nic nedeklaruji ale radši to udělám //JV spravne
            }
        }
        return newArr;
    }
    
    public static int[][] printArray (int[][]a){
        for (int i = 0; i < a.length; i++) {
            System.out.println("");
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);
            }
        }
        return a;
    } 
    
}
