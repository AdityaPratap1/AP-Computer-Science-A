
/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author  
 * @version 
 */
import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;

public class WellnessMenu extends BMI 

{
  
    public static void method()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        
        System.out.println("\nSelect a letter corresponding to a menu option.");
        
        System.out.println("[A] BMI");
        
        System.out.println("[B] BMR");
        
        System.out.println("[C] Healthy Eating menu");
        
        System.out.println("[D] Food Pyramid");
        
        System.out.println("[E] Fitness training");
        
        System.out.println("Enter the follwing letters that correspond to the option you want");
        
        String decision = input.nextLine();
        
        System.out.println();
        
         BMI object = new BMI();
        
        if(decision.equalsIgnoreCase("A") ) 
        {

         
          
          object.method();
  
         }
  

        else if(decision.equalsIgnoreCase("B") ) //condition for choice B goes in the parentheses
        {
            object.method2();
         
        }
        
        else if (decision.equalsIgnoreCase("C") ) //condition for choice C goes in the parentheses
        {
           System.out.println("This is a oned-day plan menu to hellp you decide your meals for the rest of the week");
           
           System.out.println(" ");
           
           System.out.println("Breakfast: ");
           
           System.out.println("SLOW COOKER HONEY-VANILLA MULTIGRAIN HOT CEREAL ");
           
           System.out.println(" ");
           
           System.out.println("Lunch: ");
           
           System.out.println("GRILLED PAICHE TACOS WITH PICKLED VEGGIES ");
           
           System.out.println(" ");
           
           System.out.println("Dinner:  ");
        
           System.out.println("MUSHROOM STROGANOFF ");
           
           
        }
        
        else if (decision.equalsIgnoreCase("D") ) //condition for choice D goes in the parentheses
        {
          
          
        System.out.println("                            Ftas, oils and sweets              ");
        System.out.println("           Milk, yougurt nd cheese group |  Meat, Poultry, Fish. Beans and eggs             ");
        System.out.println("      Veetable group                     |                                Fruit Group              ");
        System.out.println("  Bread                    Cereal                 rice            and             pasta                 ");
        
         
        
        
        }
        else if (decision.equalsIgnoreCase("E") ) //condition for choice E goes in the parentheses
        {
            System.out.println("MONDAY:   8-mile run ");
            
            System.out.println(" ");
            
            System.out.println(" TUESDAY:   1 hour 30 min gym weight session (upper body workout) ");
            
            System.out.println(" ");
            
            System.out.println(" WEDNESDAY: 4000 yard swim session  ");
            
            System.out.println(" ");
            
            System.out.println(" THURSDAY: 1 hour 30 min gym weight session and abs (lower body and ab workout) ");
            
            System.out.println(" ");
            
            System.out.println(" FRIDAY:  20 mile biking session  ");
            
            System.out.println(" ");
            
            System.out.println(" SATURDAY: 2 hour gym session ( combined workout session) ");
            
            System.out.println(" ");
            
            System.out.println(" SUNDAY:  Rest day! ");
            
            System.out.println(" ");
        }
        
        else //default choice for an invalid entry
        {
            System.out.println("Invalid input, choices for input are a, b, c, d, and e only. ");
        } 
    }
}

