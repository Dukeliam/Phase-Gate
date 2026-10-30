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
          
           int[][] scores = new int[student][subject];
            
            for(int index = 0; index < student; index++){
                  for(int count = 0; count < subject; count++){
                        System.out.print("Entering score for Student " + (index + 1) + ": " );
                        int  score = input.nextInt();
                         
                         while(score < 0 || score > 100){
                              System.out.print("Invalid score Try again: ");
                              score = input.nextInt();
                         }
                         scores[index][count] = score;
                         System.out.println("Svaing >>>>>>>>>>>>>>>>>>>");
                         System.out.println("Saved Successfully");
                  }
            }
            //           int[][] scores = new int[student][subject];
           
            
            for(int index = 0; index < scores.length; index++){
                  for(int count = 0; count < scores[index].length; count++){
                  
                  }

            }
      }
      
      public static int total(int[][] numbers){
                 int total = 0; 
            for(int index = 0; index < numbers.length; index++){
                  
                  for(int count = 0; count < numbers[index].length; count++){
                  total += numbers[index][count];
                  }
            }
                  return t
}
