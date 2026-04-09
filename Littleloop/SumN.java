import java.util.Scanner;
 public class SumN {
  public static void main(String[] args) {
    int Sum = 0;
    Scanner input = new Scanner(System.in);

   System.out.print("Enter number: ");
    int userInput = input.nextInt();
      int N = userInput;
    
    int i = 1;
     while(i <= N){ 
         System.out.println(Sum);
           Sum +=i;
            i++;
    }

    }
}
