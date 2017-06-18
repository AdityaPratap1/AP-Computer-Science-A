/**
 * @author Aditya Pratap  
 * @SubmissionDate 3/22/2017
 * 
 * @purpose The purpose of this assignment is to have menu as well as add and extend the BMR assignment which not only 
 *          calculates the number of calories one requires per day but also takes activity levels into consideration
 */


import java.util.Scanner;

public class Main{
  
  static double tdee;
  
  static String gender;
  
  static double rate;
  
  static String decision;
  
  public static void main(String[] args) {
    
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hello! Welcome to Daily calorie calculator. Here, you can calculate your daily recommended calorie intake depending on your activity levels. ");
    
    System.out.println(" ");
 
    
    
    BMR.filler();
      
     
    System.out.println(" ");
    
    System.out.println("Select your daily activity level - ");
    
    System.out.println(" ");
    
    System.out.println("[1] Resting ");
    
    System.out.println("[2] Sedentary");
    
    System.out.println("[3] Light ");
    
    System.out.println("[4] Moderate ");
    
    System.out.println("[5] Very active ");
    
    System.out.println("[6] Extremely active ");
    
         
    decision = input.next();
    
      
    
    ConditStats.process2();
    
      
   
  }
  
}
