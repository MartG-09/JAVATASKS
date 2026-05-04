public class TaskEight {
    public static int evenIndexArrayMinimum(int[] array){
        int number = 0;
            int count = 0;
                int smallest = array[0];

        for(count = 0; count < array.length; count++){
            if (count % 2 == 0){
                    
              if (array[count] < smallest)  {
                    smallest = array[count];
            }
                        
                }
         }
                        System.out.println(smallest);
    return smallest;
    }

            public static void main(String[] args){
                int[] array = {12 , 2 , 46 , 48 , 3};
                evenIndexArrayMinimum(array);
            }
}
