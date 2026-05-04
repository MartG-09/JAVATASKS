import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

       int[] array = new int[10];
                int count = 0;
            for(count = 0; count < array.length; count++){
                System.out.print("Enter Scores:  ");
                  int scores = inputCollector.nextInt();

                    array[count] = scores;
            }
         
            for (int counter = 0; counter < array.length; counter++){
                System.out.println(counter + "   " + array[counter]);   
                }

    }
}
