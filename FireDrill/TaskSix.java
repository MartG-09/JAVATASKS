public class TaskSix {
    public static int evenIndexArray(int[] array){
        int number = 0;
            int count = 0;
                int sum = 0;

        for(count = 0; count < array.length; count++){
            if (count % 2 == 0){
                    number = array[count];
    
                sum = sum + number;
                }
         }
    return sum;
    }

            public static void main(String[] args){
                int[] array = {12 , 2 , 46 , 48 , 3};
                 System.out.println(evenIndexArray(array));
            }
}
