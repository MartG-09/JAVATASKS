import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

       int[] array = new int[10];
                int count = 0;
            for(count = 0; count < array.length; count++){
                System.out.print("Enter Scores:  ");
                  int scores = inputCollector.nextInt();

                    array[count] = scores;
            }


    }
}
