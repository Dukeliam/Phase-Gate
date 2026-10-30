import java.util.Scanner;

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
                        System.out.print("Entering score for Student " + (index + 1) + " Subject " + (count + 1) + ": " );
                        int  score = input.nextInt();
                         
                         while(score < 0 || score > 100){
                              
                              System.out.print("Invalid score Try again: ");
                              score = input.nextInt();
                         }
                         scores[index][count] = score;
                         System.out.println("Svaing >>>>>>>>>>>>>>>>>>>");
                         System.out.println("Saved Successfully");
                          System.out.println();
                  }
                        
            }
            //           int[][] scores = new int[student][subject];
           
            
            for(int index = 0; index < scores.length; index++){
                  for(int count = 0; count < scores[index].length; count++){
                  
                  }

            }
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
                  int total = 0;
                  for(int count = 0; count < numbers[index].length; count++){
                  total += numbers[index][count];
                  
                  }
                  result[index] = (double) total / numbers.length;
            }
                  return result;
      }
}
