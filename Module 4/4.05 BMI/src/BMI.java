import java.util.Scanner;

import java.lang.Math;

public class BMI{
  
  
  public static void method() {
    
  
    
  double heightMeters;
  
  double weightKilograms;
  
  double feet1;
  
  double inches1;
  
  double weight1;
  
  double height;
  
  double BodyMassIndex;
  
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
