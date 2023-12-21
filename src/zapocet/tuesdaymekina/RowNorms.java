package zapocet.tuesdaymekina;


public class RowNorms {
    private static java.util.Scanner systemIn;
    
    public static void main(String[] args) {
        systemIn = new java.util.Scanner(System.in);
        double[][] matrix;
        try {
            matrix = getMatrix();
        } catch (NumberFormatException e) {
            return;
        }
        System.out.println(checkNorms(matrix) ? "Matice MÁ stejné normy řádků." : "Matice NEMÁ stejné normy řádků.");
    }
    
    private static boolean checkNorms(double[][] matrix) {
        double norm = 0;
        for (int i = 0; i < matrix[0].length; ++i) {
            norm += matrix[0][i] * matrix[0][i];
        }
        norm = Math.sqrt(norm);
        for (int i = 0; i < matrix.length; ++i) { //JV stacilo jit od i = 1
            double currentNorm = 0;
            for (int j = 0; j < matrix[0].length; ++j) {
                if (matrix[i][j] < 0) { return false; }
                currentNorm += matrix[i][j] * matrix[i][j];
            }
            currentNorm = Math.sqrt(currentNorm);
            if (currentNorm != norm) {
                return false;
            }
        }
        return true;
    }
    
    //JV na zkousce delejte jednoduche nacitani bez osetrovani, at se do toho nezamotate, 
    //vhodne vyjimky presunout do metod validate, aby Vam neznecitatelnovali zbytecne samotny kod programu
    
    private static double[][] getMatrix() throws NumberFormatException {
        // Get line count
        System.out.print("Zadejte počet řádků matice: ");
        String userInput = systemIn.nextLine();
        int matrixRows;
        try {
            matrixRows = Integer.parseInt(userInput);
            if (matrixRows < 1) { throw new NumberFormatException(); }
        } catch (NumberFormatException e) {
            System.out.println("Bylo zadáno špatné číslo pro počet řádků.");
            throw new NumberFormatException();
        }
        
        // Get matrix rows
        System.out.println("Zadejte matici. V řádku čísla oddělujte mezerami.");
        double[][] matrix = new double[matrixRows][0];
        int rowSize = -1;
        for (int i = 0; i < matrixRows; ++i) {
            matrix[i] = getVector(rowSize);
            if (i == 0) { rowSize = matrix[i].length; }
        }
        
        return matrix;
    }
    
    private static double[] getVector(int size) throws NumberFormatException {
        String rawUserInput = systemIn.nextLine();
        if (rawUserInput.length() == 0) {
            System.out.println("Matice nemůže mít prázdné řádky.");
            throw new NumberFormatException();
        }
        String[] splitUserInput = rawUserInput.split(" ");
        if (size != -1 && splitUserInput.length != size) {
            System.out.println("Matice musí mít konzistentní velikost.");
            throw new NumberFormatException();
        }
        double[] userNumbers = new double[splitUserInput.length];
        for (int i = 0; i < splitUserInput.length; ++i) {
            try { userNumbers[i] = Double.parseDouble(splitUserInput[i]); }
            catch (NumberFormatException e) {
                System.out.println("Zadáno neplatné číslo.");
                throw new NumberFormatException();
            }
        }
        return userNumbers;
    }
}
