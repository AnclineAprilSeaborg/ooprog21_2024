public class prelim{
   public static void main(String[] args){
    int n = 10;
    int firstNum = 0;
    int secondNum = 1;
    
    for(int i = 0; i <= n; i++){
      System.out.println("Fibonacci("+i+") = " + firstNum);
      
      int sumNum = firstNum + secondNum;
          firstNum = secondNum;
          secondNum = sumNum;
    
    }
    
   }
}
