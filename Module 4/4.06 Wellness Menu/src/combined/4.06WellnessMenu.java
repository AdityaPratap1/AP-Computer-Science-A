/**
 * @author Aditya Pratap
 * @Submission Date 3/22/2017
 *
 * @purpose - The purpose of this program is to provide the user with a variety of different options to choose from that deal
 *             with fitness including bmi, bmr, food menu, and fitness plan. This allows the user to follow and check their
 *             fitness plan and levels.
 */


import java.util.Scanner;

import java.lang.Math;

public class BMI extends BMR{
  
  public static void method() {

  double heightMeters, weightKilograms, feet1, inches1, weight1, height, BodyMassIndex;
  
  String weight;
  
  
  System.out.println(" The BMI is an attempt to quantify the amount of tissue mass (muscle, fat, and bone) in an individual, and then categorize that person as underweight, normal weight, overweight, or obese based on that value. ");
  
  
  System.out.println(" ");
  
    
    Scanner input = new Scanner(System.in);
    
     System.out.println("Enter you name (Last, First) : ");
     
         String name = input.nextLine();
         
         System.out.println(" ");
    
     System.out.println("Enter your weight in pounds : ");
    
         weight = input.nextLine();
         
         System.out.println(" ");
         
         
     System.out.println("Enter your height in feet and inches ( exapmle :- 5 7) ");
     
        String feet = input.next(); 
         
        String inches = input.nextLine();
        
        System.out.println(" ");
            
        feet1   = Double.parseDouble(feet);
        
        inches1 = Double.parseDouble(inches); 
        
        weight1 = Double.parseDouble(weight);   
        
        System.out.println("");
        
        height= ((feet1*12)+inches1);
        
        weightKilograms= (weight1 * .45);
        
        heightMeters= (height * .025);  
        
        BodyMassIndex = (weightKilograms/Math.pow(heightMeters,2));
        
       
        
        
        
         System.out.println("-----------------------------------------------------------------------");
         
          System.out.println("");
          
          System.out.println("Name : " + name);
          
          System.out.println(" ");
          
          System.out.println("height (feet and inches) : " + feet + " " + inches);
          
          System.out.println(" ");
          
          System.out.println("Height in meters is " + heightMeters);
          
          System.out.println(" ");
          
          System.out.println(" Weight in pounds :" + weight);
          
          System.out.println(" ");
          
          System.out.println("Weight in kilograms : " + weightKilograms);
          
          System.out.println(" ");
          
          System.out.println("Your Body Mass Index is approximately " + Math.round(BodyMassIndex));
           
          System.out.println(" ");
          
          
          /////////////////////////////////////////////////////////////////////////////////////
          
          
          if (BodyMassIndex < 18.5) {
            
            System.out.println("Hey! your BMI is lower than average. Why don't you try out my new nutrition plan that i made for you! ");
            
          }
          
          else if (BodyMassIndex > 18.5 && BodyMassIndex < 25) {
            
            System.out.println("Hey! You are in perfect Shape!");
            
          }
          
          else {
            
            
            System.out.println("Hey! Your BMI is above recommended. How about you try my new training plan i made for you! ");
            
            
          }
        
        
         }
  }










import java.util.Scanner;
import java.lang.Math;

class BMR{
  
   public static void method2() {
    
    System.out.println("Basal metabolic rate is the amount of energy expressed in calories that a person needs to keep the body functioning at rest. ");
    
     Scanner input = new Scanner(System.in);
     
     System.out.println("");
     
       System.out.println("Enter name :");
    
       String name = input.nextLine();
    
       System.out.println();
          
       System.out.println("Enter biological Gender (M OR F)");
              
       CharSequence gender = input.next();
       
       System.out.println("Enter age: ");
              
       int age = input.nextInt();
                
       System.out.println("Enter your height in inches: ");       
       
       double height = input.nextDouble();
       
       System.out.println("Enter weight in pounds : ");
    
       double weight = input.nextDouble(); 
       
       
       double mass = weight * 0.453592;
       
       double centimeter = height * 2.54;
      
         if (gender.equals("M") || gender.equals("m")) {
         
          double P = (((13.397*(mass))/1) + ((4.799*(centimeter))/1) - ((6.7550*(age))/1) + (66.4730)); // source = wikipedia as given in asignment instructions
           
          System.out.println("Your name is: " + name);
          
          System.out.println("You are " + age + " years old");
          
          System.out.println("Your height in inches is " + height);
          
          System.out.println("Your height in centimeters is " + centimeter);
          
          System.out.println("Your weight in pounds is " + weight);
          
          System.out.println("Your weight in kilograms is " + mass);
           
           System.out.println("Your BMR is approximately " + Math.round(P) + " Calories/Day");
           
         
         
       }

         else if (gender.equals("F") || gender.equals("f")) {
           
           
           double P2 = (((9.247*(mass))/1) + ((3.098*(centimeter))/1) - ((4.330*(age))/1) + (447.593));
           
          System.out.println("Your name is: " + name);
          
          System.out.println("You are " + age + " years old");
          
          System.out.println("Your height in inches is " + height);
          
          System.out.println("Your height in centimeters is " + centimeter);
          
          System.out.println("Your weight in pounds is " + weight);
          
          System.out.println("Your weight in kilograms is " + mass);
           
          System.out.println("Your BMR is approximately " + Math.round(P2) + " Calories/Day");
           
          System.out.println(P2);
          
          
         }   
         
         else {
           
           
           System.out.println("sorry! " + gender + " is not a given gender, run program again!");
           
         }
         
   }
   
    
}







/**
 * @author Aditya Pratap
 * @Submission Date 3/22/2017
 * 
 * @purpose - The purpose of this program is to provide the user with a variety of different options to choose from that deal
 *             with fitness including bmi, bmr, food menu, and fitness plan. This allows the user to follow and check their 
 *             fitness plan and levels.
 */

import java.util.Scanner;


public class Main extends WellnessMenu{
  
  public static 
  void main(String[] args){
    
    
  WellnessMenu object = new WellnessMenu();
  
  object.method();
    
    
  
  }
  
  
  
}


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






