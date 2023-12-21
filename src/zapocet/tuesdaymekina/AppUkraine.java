package zapocet.tuesdaymekina;


public class AppUkraine {
    private static java.util.Scanner systemIn;
    
    public static void main(String[] args) {
        systemIn = new java.util.Scanner(System.in);
        
        int flagHeight;
        try {
            flagHeight = getNumber("Zadejte šířku vlajky");
        } catch (NumberFormatException e) {
            System.out.println("To vypadá jako špatně zadané číslo.");
            return;
        }
        if (flagHeight < 2 || flagHeight % 2 != 0) {
            System.out.println("Zadané číslo musí být kladné a sudé.");
            return;
        }
        
        char upperSymbol;
        try {
            upperSymbol = getChar("Zadejte znak pro horní část vlajky");
        } catch (Exception e) {
            System.out.println("Musíte zadat přesně jeden znak.");
            return;
        }
        
        char bottomSymbol;
        try {
            bottomSymbol = getChar("Zadejte znak pro spodní část vlajky");
        } catch (Exception e) {
            System.out.println("Musíte zadat přesně jeden znak.");
            return;
        }
        
        System.out.println(Tools.ukraineFlag(flagHeight, upperSymbol, bottomSymbol));
    }
    
    private static int getNumber(String prompt) throws NumberFormatException {
        System.out.print(prompt + ": ");
        String userInput = systemIn.nextLine();
        return Integer.parseInt(userInput);
    }
    
    private static char getChar(String prompt) throws Exception {
        System.out.print(prompt + ": ");
        String userInput = systemIn.nextLine();
        if (userInput.length() != 1) {
            throw new Exception("User did not enter one char");
        }
        return userInput.charAt(0);
    }
}
