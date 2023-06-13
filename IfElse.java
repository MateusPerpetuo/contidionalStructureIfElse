
package ifelse;

import java.util.Scanner;

/**
 *  
 * @author mateus.perpetuo
 */
public class IfElse {
    
    

    public static void main(String[] args) {
        
        /**  This code assumes the student has 4 subjects,
        *    and thats why I'm using an array the size of 4.
        *    
        *    The grading system being used in this system is in the range of 0 to 100, 
        *    with 0 being the lowest grade and 100 being the highest.
        */
        
        int grades [] = new int [4];
        int i;
        float total =0, average;
        try (Scanner scanner = new Scanner(System.in)) {
            for(i=0; i<4; i++) {
                System.out.print("Enter grade number "+(i+1)+":");
                grades[i] = scanner.nextInt();
                total = total + grades[i];
            }
        }
       
       average = total/4;
       
       if (average >=80)
       {                          
           if (average == 100)
           {    
               System.out.println("The student Grade is A");
               System.out.println("Congratulations, you passed with flying colors.");
           } 
           else {
               
               System.out.println("Aproved");
               System.out.println("The student Grade is A");
           }
           
       }
       else if(average>=60 && average<80)
        {
           System.out.println("Aproved");
           System.out.println("The student Grade is B");
        } 
        else if(average >=40 && average < 60)
        {
            System.out.println("Failed");
            System.out.println("The student Grade is C");
        }
        else
        {
            System.out.println("Failed");
            System.out.println("The student Grade is D");
        }
       
          
       
    }
    
}
