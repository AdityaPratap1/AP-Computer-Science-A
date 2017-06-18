/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;

public class CarV7
{

    public class OptCar{

        //initialize variables
        String name;
        public int milesAtStart, milesWhenEnd;
        public double gallonsUsed, pricePGallon;

        public OptCar(String name, int startMiles, int endMiles, double gallonsUsed, double pricePerGallon)
        {
            this.name= name;
            this.milesAtStart= startMiles;
            this.milesWhenEnd = endMiles;
            this.gallonsUsed = gallonsUsed;
            this.pricePGallon = pricePerGallon;
        }

    }

    public static int calcDistance(int sMiles, int eMiles) //given code
    {
        return eMiles-sMiles;
    }
    public static double calcMPG(int dist, double gals) //given code
    {
        return dist/gals;
    }
    public static double calcCost(double pricePerGallon, double gals) //given static method
    {
        return pricePerGallon*gals;
    }
    public static double calcGPM(int dist, double gals) //given static method
    {
        return gals/dist;
    }
}

