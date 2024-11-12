

import java.util.Scanner;

public class SpoonerismGenerator {

    
    private static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    
    private static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ("AEIOUaeiou".indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    
    public static void run() {
        String wOne = getWord("Enter the first word: ");
        String wTwo = getWord("Enter the second word: ");
        
        
        int inOne = vowelIndex(wOne);
        int inTwo = vowelIndex(wTwo);

        
        if (inOne > 0 && inTwo > 0) {
            
            System.out.println(wOne + " and " + wTwo + " spoonerized are " +
                wTwo.substring(0, inTwo) + wOne.substring(inOne) + " " +
                wOne.substring(0, inOne) + wTwo.substring(inTwo));
        } else {
            System.out.println(wOne + " and " + wTwo + " are not good words to spoonerize.");
        }
    }

        public static void main(String[] args) {
        run();
    }
}


