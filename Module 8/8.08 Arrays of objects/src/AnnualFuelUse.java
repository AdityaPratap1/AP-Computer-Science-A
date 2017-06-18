/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
public class AnnualFuelUse{

    String name;

    public static double milesAtStart, milesWhenEnd, fillUps, days;

    public static double gallonsUsed, pricePGallon;

    public AnnualFuelUse(double fillUps,  double endMiles, double startMiles, double gallonsUsed, double pricePerGallon) // define constructor
    {
        this.fillUps= fillUps;
        this.days = days;
        this.milesAtStart= startMiles;
        this.milesWhenEnd = endMiles;
        this.gallonsUsed = gallonsUsed;
        this.pricePGallon = pricePerGallon;
    }



    public static double getDistance(double milesWhenEnd, double milesAtStart)  // define method getDistance
    {
        return milesWhenEnd- milesAtStart;
    }
    public static double getMPG(double gallonsUsed)
    {
        return getDistance(milesWhenEnd, milesAtStart)/gallonsUsed;
    }

    public static double getGPM(double gallonsUsed)
    {
        return gallonsUsed/getDistance(milesWhenEnd, milesAtStart);
    }

    public static double getTotalCost(double pricePGallon, double gallonsUsed){

        return pricePGallon * gallonsUsed;


    }



    public static double min(double minMaxVariable[]) // define method min
    {
        Double minVariable = Double.MAX_VALUE;
        for(int i = 0; i < minMaxVariable.length; i++)
        {
            if (minMaxVariable[i] < minVariable)
            {
                minVariable = minMaxVariable[i];
            }
        }
        return minVariable;
    }

    public static double max(double minMaxVariable[])
    {
        Double maxVariable = Double.MIN_VALUE;
        for(int i = 0; i < minMaxVariable.length; i++)
        {
            if(minMaxVariable[i] > maxVariable)
            {
                maxVariable = minMaxVariable[i];
            }
        }
        return maxVariable;
    }


    public static double totalOf(double totalVariable[])
    {
        double totalValue = 0;
        for(double newValue : totalVariable)
        {
            totalValue += newValue;
        }
        return totalValue;
    }

    public static double annualProjection(double days[], double annualVariable)
    {
        double totalValue = 0;
        for(double newValue : days)
        {
            totalValue += newValue;
        }
        return 365 / (totalValue - 1) * annualVariable;
    }
}



