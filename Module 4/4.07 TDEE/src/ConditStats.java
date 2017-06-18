//package varun;

//import varun.Main;
//import varun.BMR;
import java.lang.Math;

class ConditStats extends BMR{
  
  public static void process2(){
    
    if (gender.equalsIgnoreCase("M") && decision.equals("1") || gender.equalsIgnoreCase("F") && decision.equals("1")  ) {
      
          tdee = rate * 1.0;
         
         System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
      
    }
    
    else if(gender.equalsIgnoreCase("M") && decision.equals("2") || gender.equalsIgnoreCase("F") && decision.equals("2")) {
      
        tdee = rate * 1.3;
        
        System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
      
    }
    
    
    else if(gender.equalsIgnoreCase("M") && decision.equals("3")) {
      
       tdee = rate * 1.6;
       
       System.out.println("Your daily recommended intake is " + Math.round(tdee)+" calories per day" );
     
         
       
    }
    
    
    else if(gender.equalsIgnoreCase("M") && decision.equals("4")) {
      
      
      
      tdee = rate * 1.9;
      
      System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
      
    }
    
     else if(gender.equalsIgnoreCase("M") && decision.equals("5")) {
     
     tdee = rate * 2.1;
     
     System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
    
     }
  
  
      else if(gender.equalsIgnoreCase("M") && decision.equals("6")) {
        
        
        tdee = rate * 2.4;
        
        System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
        
      }
    
    
     else if(gender.equalsIgnoreCase("F") && decision.equals("3")) {
       
       
       tdee = rate * 1.5;
       
       System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
       
       
     }
    
    else if(gender.equalsIgnoreCase("F") && decision.equals("4")) {
      
      tdee = rate * 1.6;
      
      System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
      
    }
    
    else if(gender.equalsIgnoreCase("F") && decision.equals("5")) {
      
      tdee = rate * 1.9;
      
      System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
      
    }
    
    else if(gender.equalsIgnoreCase("F") && decision.equals("6")) {
      
      tdee = rate * 2.2;
      
      System.out.println("Your daily recommended intake is " + Math.round(tdee) +" calories per day");
      
    }
    
  }
  
  
  
}





