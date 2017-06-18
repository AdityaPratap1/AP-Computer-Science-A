
/**
 * This program is a currency converter that converts currency between USD to Mexican Peso to Japanese Yen to Euros.
 * 
 * @author (Pratap, Ady) 
 * @version (11/5/2016)
 */
public class currencyConverter extends initializeVariables
{
    
public void Converter() {
    
       
    System.out.println( "Starting US Dollars = $" + startedWithUsd);
    System.out.println();
    System.out.println( "US Dollars spent in Mexico = $" + spentInMexicoUsd);
    System.out.println( "US Dollars spent in Japan = $" + spentInJapanUsd);
    System.out.println( "US Dollars spent in France = $" + spentInFranceUsd);
    System.out.println();
    System.out.println( "Remaining US Dollars = $" + remainingUsdAfterFrance);

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        
     System.out.println("Item 1");
        System.out.println("   Cost per item: $" + itemOneCost );
        System.out.println("   Budget: $"+ itemOneBudget);
        System.out.println("   Total items purchased: " +  numberOfItems);
        System.out.println("   Funds remaining: $"  +  budgetRemaining);  //how much of the budget is left
     
        
     System.out.println("Item 2");
        System.out.println("   Cost per item: $" + itemTwoCost );
        System.out.println("   Budget: $"+ itemTwoBudget);
        System.out.println("   Total items purchased: " +  numberOfItems2);
        System.out.println("   Funds remaining: $"  +  budgetRemaining2);


        
    }
    public static void main(String args[]) {
         currencyConverter crncycnvrtr = new currencyConverter();
             crncycnvrtr.Converter();
}
}