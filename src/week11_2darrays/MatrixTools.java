package week11_2darrays;

public class MatrixTools {


    public static void main(String[] args) {
        //double[][] test = new double[2][3];
        double[][] test = {{ 2, 1, -4},
                           {-1, 5,  2}};
        System.out.println("Max abs " + maxAbs(test));
        double[][] normTest = normMatrix(test);
        System.out.println("");
    }
    
    public static double[][] normMatrix(double[][] a){
        //1. Projdeme pole a najde max absolutni hodnotu
        double maxAbs = maxAbs(a);
        
        //2. Projdeme pole a kazdy prvek vydelime max absolutni hodnotou
        double[][] b = new double [a.length][a[0].length];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
              b[i][j]  = a[i][j] / maxAbs;
            }
        }
        return b;
    }
    
    public static double maxAbs(double[][] a){
        double maxAbs = -Double.MAX_VALUE;
        double absElement;
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                absElement = Math.abs(a[i][j]);
                if(absElement > maxAbs){
                    maxAbs = absElement;
                }
            }
        }
        return maxAbs;
    }
    
}
