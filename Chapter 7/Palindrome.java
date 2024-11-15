import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String wrd = scanner.nextLine();

        String wp = wrd.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if (wp.equals(new StringBuilder(wp).reverse().toString())) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This is not a palindrome.");
        }

    }
}

