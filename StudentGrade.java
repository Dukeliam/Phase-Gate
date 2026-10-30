import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
      public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            System.out.println("How many students do you have?");
            int student = input.nextInt();
            
            System.out.println("How many subects do they offer?");
            int subject = input.nextInt();
            
            System.out.println("Svaing >>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved Successfully");
            System.out.println();
          
           int[][] scores = new int[student][subject];
            
            for(int index = 0; index < student; index++){
                  for(int count = 0; count < subject; count++){
                        System.out.println("Entering score for Student " + (index + 1));
                        System.out.print("Entering score for Subject " + (count + 1) + ": " );
                        int  score = input.nextInt();
                         
                         while(score < 0 || score > 100){
                              
                              System.out.print("Invalid score Try again: ");
                              score = input.nextInt();
                         }
                         scores[index][count] = score;
                         System.out.println("Saving >>>>>>>>>>>>>>>>>>>");
                         System.out.println("Saved Successfully");
                          System.out.println();
                  }
                        
            }

            int[] totals = total(scores);
            double[] averages = average(scores);
            int[] positions = position(scores);

            System.out.println("==============================================================");
            System.out.println("STUDENT\tSUB1\tSUB2\tSUB3\tTOT\tAVE\tPOS");
            System.out.println("==============================================================");

            for (int index = 0; index < scores.length; index++) {

                System.out.print("Student " + (index + 1) + "\t");

                for (int count = 0; count < scores[index].length; count++) {
                    System.out.print(scores[index][count] + "\t");
                }

                System.out.print(totals[index] + "\t");
                System.out.printf("%.2f\t", averages[index]);
                System.out.println(positions[index]);
            }

            System.out.println("==============================================================");
      }
      
     public static int[] total(int[][] numbers){
                 int[] result = new int[numbers.length];
            for(int index = 0; index < numbers.length; index++){
                  int total = 0;
                  for(int count = 0; count < numbers[index].length; count++){
                  total += numbers[index][count];
                  
                  }
                  result[index] = total;
            }
            return result;
      }
      public static double[] average(int[][] numbers){
            double[] result = new double[numbers.length];
            
            for(int index = 0; index < numbers.length; index++){
                  int sum = 0;
                  for(int count = 0; count < numbers[index].length; count++){
                  sum += numbers[index][count];
                  
                  }
                  result[index] = (double) sum / numbers.length;
            }
                  return result;
      }
      public static int[] position(int[][] numbers){
            int[] result = new int[numbers.length];
            double[] averages = average(numbers);
            
            for(int index = 0; index < numbers.length; index++){
                  int rank = 1;
                  for(int count = 0; count < numbers.length; count++){
                        if(averages[count] > averages[index]){
                             rank++; 
                        }
                  }
                  result[index] = rank;
            }
            return result;
      }     
}
