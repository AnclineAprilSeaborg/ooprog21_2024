import java.util.Scanner;

public class SammysRentalPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" +
                           "\nS Sammy's makes it fun in the sun. S" +
                           "\nSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        
        System.out.print("\nMinutes equipment has been rented: ");
        int minutesRented = scanner.nextInt();

        
        int hours = minutesRented / 60;
        int minRemainder = minutesRented % 60;

        
        int totalPrice;
        if (minutesRented > 60) {
            
            totalPrice = (hours * 40) + minRemainder;
        } else {
            
            totalPrice = 40;
        }

        
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minRemainder);
        System.out.println("Total price: $" + totalPrice);
    }
}
