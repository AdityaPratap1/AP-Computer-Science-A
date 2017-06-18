
/**
 *All the variables used in currencyConverter are declared and initialized here to avoid confusion and mess.
 * 
 * @author (Pratap, Ady) 
 * @version (11/13/2016)
 */
public class initializeVariablesV2
{
   
    
    // initialize variables for currency converter program 
    
  static double usdToPeso = 19.02;  // 1 USD TO Peso
    
  static double usdToYen =  103.11; // 1 USD TO Yen
    
  static double usdToEuro = 0.90; // 1 USD TO Euro
    
  static double pesoToUsd = 0.053; // 1 Peso TO USD
    
  static double pesoToYen = 5.42; // 1 Peso TO Yen
    
  static double pesoToEuro = 0.047; // 1 Peso TO Euro
    
  static double yenToUsd =  0.0097; // 1 Yen TO USD
    
  static double yenToPeso =  0.18; // 1 Yen TO Peso
    
  static double yenToEuro =  0.0087; // 1 Yen TO Euro
    
  static double euroToUsd =  1.11; // 1 Euro TO USD
    
  static double euroToPeso = 21.19; // 1 Euro TO Peso
    
  static double euroToYen =  114.88;  // 1 Euro to Yen
    
    
    
    // Initialize spending variables in country's currency but not in USD.
  static double spentInMexico = 7210.25; // Spent in Peso
    
  static double spentInJapan = 99939.75; // Spent in Yen
    
  static double spentInFrance = 624.95; // Spent in Euro
    
    
    
    // Initialize spending variables in USD
    
  static double startedWithUsd = 5000.0; // Startin amount in USD
    
  static double spentInMexicoUsd = spentInMexico * pesoToUsd; // Amount spent in Mexico(Peso) converted to USD
    
  static  double spentInJapanUsd = spentInJapan * yenToUsd;    // Amount spent in Japan(Yen) converted to USD
    
  static double spentInFranceUsd = spentInFrance * euroToUsd;  // Amount spent in France(Euro) converted to USD
    
    
    
    
    //remaining US dollars
    
  static double remainingUsdAfterMexico = startedWithUsd - spentInMexicoUsd;
    
  static  double remainingUsdAfetrJapan = remainingUsdAfterMexico - spentInJapanUsd;
    
  static double remainingUsdAfterFrance = remainingUsdAfetrJapan - spentInFranceUsd; 
   
   
   
   // budget variables for items
   
   //Calculations for Souvenir #1
  static  int itemOneCost = 4;                                   //cost per item of first souvenir
     
  static int itemOneBudget = 50;                                //budget for first item
     
  static int numberOfItems =  itemOneBudget/itemOneCost ;       //how many items can be purchased
     
  static double budgetRemaining = itemOneBudget % itemOneCost;  //how much of the budget is left
     
     
     //Calculations for Souvenir #2
  static  double itemTwoCost = 32.55;                             //cost per item of second souvenir
        
  static  int itemTwoBudget = 713;                                  //budget for second item
    
  static int numberOfItems2 = (int) (itemTwoBudget/ itemTwoCost);                  //how many items can be purchased
     
  static double budgetRemaining2 =  itemTwoBudget % itemTwoCost ;   //how much of the budget is left

}
