import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) { 
   
        int highest, middle, lowest;
   
        Scanner scanner = new Scanner(System.in);
      
        
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();
      
        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();
      
        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();
      
        
        if (num1 >= num2 && num1 >= num3) {
            highest = num1;
            if (num2 >= num3) {
                middle = num2;
                lowest = num3;
            } else {
                middle = num3;
                lowest = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {             
                    highest = num2;
            if (num1 >= num3) {
                middle = num1;
                lowest = num3;
            } else {
                middle = num3;
                lowest = num1;
            }
        } else {
            highest = num3;
            if (num1 >= num2) {
                middle = num1;
                lowest = num2;
            } else {
                middle = num2;
                lowest = num1;
            }
        }
      
       
        System.out.println("Numbers in ascending order: " + lowest + " " + middle + " " + highest);
        System.out.println("Numbers in descending order: " + highest + " " + middle + " " + lowest);
        
        
        
    }
}
