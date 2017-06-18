/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Arrays;

public class AnnualFuelUseTester{

    public static void main1()
    {

        String header = "Annual Gas Mileage Calculations",

                headerLine = "===============================";

        String[] info = new String[]{"Fill Ups    ", "Days    ", "Start Miles    ", "End Miles    ", "Distance    ", "Gallons    ", "Price    ", "Cost of Trip    ", "Miles/Gal    ", "Gal/Mile    "};

        double[] fillUps = new double[]{1, 2, 3, 4};

        // define all invloved variables (arrays)

        double[] daysPassed = {1, 5, 9, 13},
                startMiles1 = {2200, 2341, 2456, 2598},
                endMiles1   = {2341, 2456, 2598, 2619},
                gallonsUsed= {20, 18, 22.6, 19.1},
                milesPerGallon=  new double[endMiles1.length],
                gallonsPerMile =  new double[endMiles1.length],
                pricePerGallon = {2.86, 2.76, 2.91, 2.54},
                totalCost =  new double[endMiles1.length],
                distance =  new double[endMiles1.length];

        // declare local variables that will be used to calculate totals, mins, maxs, and annuals

        double minMPG, minPrice, maxMPG, maxPrice, minDistance, maxDistance, totalDistance, annualDistance, totalGallonsUsed, totalCosts, totalDaysPassed, totalMPGAverage, annualGallonsUsed, annualCost, annualMPG;

        // store the value of each element of given arrays in one AnnualFuelUse[] array
        AnnualFuelUse[] van =  {new AnnualFuelUse(fillUps[0], endMiles1[0], startMiles1[0], gallonsUsed[0], pricePerGallon[0]),
                new AnnualFuelUse(fillUps[1], endMiles1[1], startMiles1[1], gallonsUsed[1], pricePerGallon[1]),
                new AnnualFuelUse(fillUps[2], endMiles1[2], startMiles1[2], gallonsUsed[2], pricePerGallon[2]),
                new AnnualFuelUse(fillUps[3], endMiles1[3], startMiles1[3], gallonsUsed[3], pricePerGallon[3])};


        for(int index = 0; index < van.length; index++)
        {
            distance[index] = van[index].getDistance(endMiles1[index], startMiles1[index]);   // set the elements of the array distance[] with returned distance value
            milesPerGallon[index] = van[index].getMPG(gallonsUsed[index]);
            gallonsPerMile[index] = van[index].getGPM(gallonsUsed[index]);
            totalCost[index] = van[index].getTotalCost(pricePerGallon[index],gallonsUsed[index]);
        }


        minDistance = AnnualFuelUse.min(distance); // define minDistance with returned value from class AnnualFuelUse
        minMPG = AnnualFuelUse.min(milesPerGallon);
        minPrice = AnnualFuelUse.min(pricePerGallon);
        maxDistance = AnnualFuelUse.max(distance);
        maxMPG = AnnualFuelUse.max(milesPerGallon);
        maxPrice = AnnualFuelUse.max(pricePerGallon);


        totalDistance = AnnualFuelUse.totalOf(distance);
        totalGallonsUsed = AnnualFuelUse.totalOf(gallonsUsed);
        totalCosts = AnnualFuelUse.totalOf(totalCost);
        totalMPGAverage = AnnualFuelUse.totalOf(milesPerGallon) / milesPerGallon.length;
        totalDaysPassed = AnnualFuelUse.totalOf(daysPassed) - 1;

        annualDistance = AnnualFuelUse.annualProjection(daysPassed, totalDistance);
        annualGallonsUsed = AnnualFuelUse.annualProjection(daysPassed, totalGallonsUsed);
        annualCost = AnnualFuelUse.annualProjection(daysPassed, totalCosts);
        annualMPG = AnnualFuelUse.annualProjection(daysPassed, totalMPGAverage) / totalDaysPassed;

        System.out.printf("%74s%n", header);
        System.out.printf("%74s%n", headerLine);


        System.out.print(Arrays.toString(info) + "\t");


        System.out.println("\n=========================================================================================================================");

        for(int index = 0; index < van.length; index++)
        {
            System.out.printf("%4f%10.0f%14.0f%14.0f%12.0f%16.1f%11.2f%12.2f%12.2f%13.3f%n", fillUps[index], daysPassed[index], startMiles1[index], endMiles1[index], distance[index], gallonsUsed[index], pricePerGallon[index], totalCost[index], milesPerGallon[index], gallonsPerMile[index]);
        }

        System.out.println("=========================================================================================================================\n");

        System.out.printf("Minimum:%46.0f%27.2f%24.2f%n", minDistance, minPrice, minMPG);
        System.out.printf("Maximum:%46.0f%27.2f%24.2f%n%n", maxDistance, maxPrice, maxMPG);
        System.out.printf("Totals:%46.0f%27.2f%24.2f%n%n", totalDistance, totalGallonsUsed, totalCosts);
        System.out.printf("Annual Projection:%36.0f%16.1f%23.2f%12.2f%n", annualDistance, annualGallonsUsed, annualCost, annualMPG);


    }
}

