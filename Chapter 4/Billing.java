public class Billing{
   public static void main(String[] args){
   
   computeBill(23.2);
   computeBill(24.5, 2);
   computeBill(25, 3, 4);
   }
   
      public static void computeBill(double price){
    
      double result =  price * 1.08;
      
      System.out.println("The total price for the bill is: $" + result);
      
      }
   
         public static void computeBill(double price, int quantity){
         
         
         double result = price * quantity * 1.08;
         
         System.out.println("The total price for the bill is: $" + result);
         
         }
   
            public static void computeBill(double price, int quantity, int couponDisc){
            
            double result = (price * quantity * 1.08) - couponDisc;
            
            System.out.println("The total price for the bill is: $" + result);
            
            
            
            }

}
