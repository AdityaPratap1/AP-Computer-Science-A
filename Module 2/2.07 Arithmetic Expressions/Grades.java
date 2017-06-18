

/**
 * The purpose of this program is to count the number of
 * tickets sold and the amount of money received.
 * 
 * ©FLVS 2007
 * @author Pratap, Ady  
 * @version 10/31/2016
 */
import java.util.Scanner;
public class Grades
{
    public static void main(String[ ] args)
    {
     int counter = 2;
     double grade = 100.0;
     System.out.println("There are 10 assignments in this calss");
     int agcounter = 1;
   
     do{
     
     System.out.println("Enter grade " + agcounter); // agcounter is the aggsinment counter or the number of assignment (example:- enetr grade 1 or 2 or 3)
     
     agcounter++;       
     
     Scanner newGrade = new Scanner(System.in);
     
     Scanner type = new Scanner(System.in);// New Scanneer for the type of assignment (test, quiz or classwork)
     
          
     double average = (grade + (newGrade.nextDouble()));// adds final grade plus the grade entered
     
     double finalGrade = average/counter; // divides the final grade with number of assignments
     
     grade = finalGrade; // the new grade is the grade 
     
     System.out.println(newGrade.nextLine());
     
     System.out.println("Student final grade in the class is " + finalGrade);
     
     System.out.println();
     
     }while(agcounter<11);
     
     }//end of main method
}//end of class
