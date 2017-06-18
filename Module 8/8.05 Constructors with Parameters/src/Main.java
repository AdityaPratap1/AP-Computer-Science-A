/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;

public class Main{

    public static class CarV5{

        private Scanner input = new Scanner(System.in);

        //set 1
        private  String cType;
        private  double eMiles, sMiles, gallonsUsed, pricePerGallon, costOfTrip, mil, gallonsPerMile, milesPerGallon;






        public  CarV5(String carType1, double endMiles1,double startMiles1, double gallonsUsed1, double pricePerGallon1, double costOfTrip1, double milesPerGallon1, double gallonsPerMile1 ){


            cType = carType1;

            eMiles = endMiles1;

            sMiles = startMiles1;

            gallonsUsed = gallonsUsed1;

            pricePerGallon = pricePerGallon1;

            costOfTrip = costOfTrip1;

            milesPerGallon = milesPerGallon1;

            gallonsPerMile = gallonsPerMile1;

        }

        public double calculateDistance(){

            return eMiles - sMiles;



        }


        public double calculateMpg(){

            return ((double)calculateDistance())/gallonsUsed;

        }

        public double calculateGpm(){

            return ((double)gallonsUsed)/calculateDistance();


        }

        public double calculateCost(){


            double cost = (gallonsUsed*pricePerGallon);

            return cost;


        }


    }

    public static void main(String[] args){

        double milesDriven1, startMiles1, endMiles1, gallons1, milage1, distance1, mpg1, gpm1, cost1, price1, milesPerGallon1, gallonsPerMile1;
        String carType1, line1;

        carType1 = "Hyundai Sonata";
        startMiles1 = 142388;
        endMiles1 = 142693;
        gallons1 = 11.65;
        price1 = 2.52;
        line1 = "";

        CarV5 car1 = new CarV5(carType1, endMiles1, startMiles1, gallons1, price1, (gallons1 * price1), ((endMiles1 - startMiles1) / gallons1), (gallons1 / price1));


        // using methods to fill variables
        cost1 = car1.calculateCost();

        distance1 = car1.calculateDistance();

        mpg1 = car1.calculateMpg();

        gpm1 = car1.calculateGpm();

        System.out.printf("%53s", "Gas Mileage Calculations\n");

        System.out.printf("%15s", "Type of Car");

        System.out.printf("%19s", "Start Miles");

        System.out.printf("%13s", "End Miles");

        System.out.printf("%12s", "Distance");

        System.out.printf("%11s", "Gallons");

        System.out.printf("%13s", "Miles/Gal\n");

        for(int counter1 = 1; counter1 < 83; counter1++)

            line1 += "=";

        System.out.println(line1);

        System.out.print(carType1);

        System.out.printf("%14d", startMiles1);

        System.out.printf("%13d", endMiles1);

        System.out.printf("%12d", distance1);

        System.out.printf("%11.1f", gallons1);

        System.out.printf("%10.2f", price1);

        System.out.printf("%8.2f", cost1);

        System.out.printf("%11.1f", mpg1);

        System.out.printf("%14.3f", gpm1);


    }

}

