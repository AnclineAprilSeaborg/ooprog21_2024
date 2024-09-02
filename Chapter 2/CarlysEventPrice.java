import java.util.Scanner;

   public class CarlysEventPrice{

      public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.println("*********************************" +
                            "\n* Carly's makes the food that   *" +
                            "\n*     makes it a party.         *"  +
                            "\n*********************************");
                
         System.out.print("How many guest are there in this event?:");
         int guestNumber = scanner.nextInt();
         System.out.println("The price per guest is $35");
         
         int price = 35;
         
         int totalPrice = guestNumber * price;
         
         
         System.out.println("The number of guest in this event is " + guestNumber);
         System.out.println("The total price is $" + totalPrice);
         
         if(guestNumber >= 50){
            System.out.println("Large Event: TRUE");
         } else {
            System.out.println("Large Event: FALSE");
         }
         


         }

   }
