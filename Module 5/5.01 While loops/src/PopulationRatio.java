import java.util.Scanner;

public class PopulationRatio{
  
  
  
  public void facts() {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the population of INDIA: " );
    
    int population = input.nextInt();
    
    int men = 0;
    
    int women = 0;
    
   
    
    int counter = 0;
    
    System.out.println(" ");
    
        while(counter <= population) {
          
          women = population - men;
          
          counter++;
          
         double randomNum = Math.random();
          
          if(randomNum <= 0.481) {
            
            women++;
            
          } else {
            
            men++;
            
          }
          
        }
    
    System.out.println("The number of women living in India are " + women);
    
    System.out.println("The number of men in India are " + men);
   
    
    
     }
  
  
  
  
}
