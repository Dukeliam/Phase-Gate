import java.util.Arrays;

public class Reverse{
      public static int[] reverse(int[] numbers){
            int[] newArray = new int[numbers.length];
            
            for(int index = 0; index < numbers.length; index++){
                  newArray[index] = numbers[numbers.length - index - 1];
            }
            return newArray;
      }

      public static int[][] arrayIndex(int[][] numbers){
            for(int index = 0; index < numbers.length; index++){
                  numbers[index] = reverse(numbers[index]);
            }
                  return numbers;
      }

      public static void main(String[] args){
            int[][] input = {{8,9}, {2,4,5,}, {3}, {1,4,2,8}};
            
            System.out.println(Arrays.deepToString(arrayIndex(input)));
      }
}
