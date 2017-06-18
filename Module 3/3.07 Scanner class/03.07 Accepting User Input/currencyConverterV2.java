
/**
 * This program is a currency converter that converts currency between USD to Mexican Peso to Japanese Yen to Euros.
 * 
 * @author (Pratap, Ady) 
 * @version (11/13/2016)
 */
import java.util.Scanner;
public class currencyConverterV2 extends initializeVariablesV2
{
public void Converter() {
    
    // The program below is assignment 3.07 accepting user input part 1 A but was not included in the instructions. 
        
   System.out.println("What currency do you want to convert USD to?");
 
   System.out.println("Hit 1 for Yen, 2 for Peso and 3 for Euro");
   
   Scanner currency = new Scanner(System.in);
   
   double finalAmount;
   
   switch (currency.nextInt()) {
   
       case 1: 
     Scanner yen = new Scanner(System.in); // new scanner object for usd amount
     
     System.out.println("Enter amount in USD");
     
     finalAmount = (yen.nextDouble() * usdToYen); // usdToYen declared in another class
     
     System.out.println("Your amount in Yen is " + finalAmount);
     
     break;
     
      case 2: 
     Scanner peso = new Scanner(System.in);
     
     System.out.println("Enter amount in USD");
     
     finalAmount = (peso.nextDouble() * usdToPeso);
     
     System.out.println("Your amount in Peso is " + finalAmount);
     
     break;
     
      case 3: 
     Scanner euro = new Scanner(System.in);
     
     System.out.println("Enter amount in USD");
     
     finalAmount = (euro.nextDouble() * usdToEuro);
     
     System.out.println("Your amount in Euro is " + finalAmount);
     
     break;
    
     
     default: 
      System.out.println("Enter a value");
          
          }
          
          
     System.out.println();
     
          
     System.out.println();
     
     
     System.out.println();
     
     
     System.out.println();
     
     
     System.out.println();
          
          
          
     // The program below is a part of the instructions assigned. in this program, the user will enter the exchange rate and the program will convert it into the intended currency
      
      System.out.println("Exchange rates change all the time. To avoid outdated information, it is easy if the user inputs the amount and the exchange rate");
      
      System.out.println("What currency do you want to convert USD to?");
 
      System.out.println("Hit 1 for Yen, 2 for Peso and 3 for Euro");
                         
  switch (currency.nextInt()) {
   
       case 1:
       
     Scanner amount = new Scanner(System.in); // new sccanner object to enter amount in USD
     
     System.out.println("Enter amount in USD");
           
     double usd = amount.nextDouble(); // stores the USD amount in variable usd
     
     Scanner rate = new Scanner(System.in); // new scanner object to enter exchange rate
          
     System.out.println("Enter exchange rate(1 USD to Yen)");
    
     double exrate = rate.nextDouble(); // stores entered value in exrate
     
     finalAmount = (usd * exrate );
             
     System.out.println("Your amount in Yen is " + finalAmount);
     
     break;
     
     
     
     
      case 2: 
      
     Scanner amount2 = new Scanner(System.in);
     
     System.out.println("Enter amount in USD");
     
     usd = amount2.nextDouble();
     
     Scanner rate2 = new Scanner(System.in);
     
     System.out.println("Enter exchange rate(1 USD to Yen)");
     
     exrate = rate2.nextDouble();
     
     finalAmount = (usd * exrate);
     
     System.out.println("Your amount in Peso is " + finalAmount);
     
     
     break;
     
     
     
     
      case 3:
      
     Scanner amount3 = new Scanner(System.in);
      
     System.out.println("Enter amount in USD");
     
     usd = amount3.nextDouble();
     
     Scanner rate3 = new Scanner(System.in);
     
     System.out.println("Enter exchange rate (1 USD to Euro)");
     
     exrate = rate3.nextDouble();
     
     finalAmount = (usd * exrate);
     
     System.out.println("Your amount in Euro is " + finalAmount);
     
     break;
    
     
     default: 
      System.out.println("Enter a value");
          
     }                        
    }            
    public static void main(String args[]) {
         currencyConverterV2 crncycnvrtr = new currencyConverterV2();
             crncycnvrtr.Converter();
}
}