package zapocet.tuesdaymekina;


public class Tools {
    //JV nevidim, kde jste to testoval

    public static int sumThreeDigits(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; ++i) {
            if (
                    (String.valueOf(numbers[i]).length() == 3 && numbers[i] > 0) ||
                    (String.valueOf(numbers[i]).length() == 4 && numbers[i] < 0)
            ) {
                sum += numbers[i];
            }
        }
        return sum;
    }
    
    public static boolean isFibonacci(int[] numbers) {
        int lastSum = 0;
        int currentSum = 1;
        if (numbers.length == 0) {
            return false;
        }
        
        // Find first number in the Fibonacci series
        while (numbers[0] > lastSum) { //JV podle zadani prvni prvek ma byt 0 a druhy 1, takze tohle je zbytecne 
            currentSum += lastSum;
            lastSum = currentSum - lastSum;
        }
        if (numbers[0] != lastSum) {
            return false;
        }
        
        // Iterate over numbers
        for (int i = 1; i < numbers.length; ++i) {
            if (numbers[i] != currentSum) { return false; }
            currentSum += lastSum;
            lastSum = currentSum - lastSum;
        }
        return true;
    }
    
    public static String ukraineFlag(
            int flagHeight,
            char symbolUpper,
            char symbolBottom
    ) {
        if (flagHeight < 2 || flagHeight % 2 != 0) {
            return "";
        }
        int flagWidth = flagHeight / 2 * 3;
        
        // Create lines of the flag
        String lineUpper = (symbolUpper + "  ").repeat(flagWidth).substring(0, flagWidth * 3 - 2) + '\n';
        String lineBottom = (symbolBottom + "  ").repeat(flagWidth).substring(0, flagWidth * 3 - 2) + '\n';
        
        // Join lines
        String result = lineUpper.repeat(flagHeight / 2) + lineBottom.repeat(flagHeight / 2);
        
        return result;
    }
}
