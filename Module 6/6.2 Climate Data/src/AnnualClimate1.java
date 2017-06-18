/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class AnnualClimate1 extends DeclareArrays {

    public Scanner input = new Scanner(System.in);

    int city;

    String month, Location;

    double average, annual;

    String[] cities = new String[12];

    String temp = "";


    public  void weather() {


        String[] cities = {"[1] Apalachicola FL",  "[2] Daytona Beach FL", "[3] Fort Myers FL", "[4] Gainesville FL", "[5] Jacksonville FL", "[6] Key West FL", "[7] Miami FL", "[8] Orlando FL", "[9] Pensacola FL", "[10] West Palm Beach FL", "[11] Tallahassee FL",  "[12] Vero Beach FL" };

        System.out.println("Do you want your temperature and precipitation in F and in or C and cm?(enter F or C)");

        temp = input.nextLine();



        if(!temp.equalsIgnoreCase("c") || !temp.equalsIgnoreCase("f")){ // if the user does not enter c or f for the units question in the begining

            System.out.println("Sorry," + temp + " is not a given option");

            System.exit(1);

        }


        System.out.println("Choose a city from the following list (Enter number) : ");

        System.out.println(" ");


        for (int i = 0; i < cities.length; i++){ // this loop is to print the array vertically and to make it more readable.

            System.out.println(cities[i]);

            System.out.println(" ");
        }


        city = input.nextInt();


        switch(city){ // Switch and case to check which city was enetered

            case 1:

                temperature = temperature1; // if city is 1, get the array temperature1 from class DeclareArrays and set the array to temperature array.

                precipitation = precipitation1; // if city is 1, get the array precipitation1 from class DeclareArrays and set the array to precipitation array.

                Location = "Apalachicola, FL"; // set location to chosen location.
                break;

            case 2:

                temperature = temperature2;

                precipitation = precipitation2;

                Location = "Daytona Beach, FL";
                break;

            case 3:

                temperature = temperature3;

                precipitation = precipitation3;

                Location = "Fort Myers, FL";
                break;

            case 4:

                temperature = temperature4;

                precipitation = precipitation4;

                Location = "Gainesville, FL";
                break;

            case 5:

                temperature = temperature5;

                precipitation = precipitation5;

                Location = "Jacksonville, FL";
                break;

            case 6:

                temperature = temperature6;

                precipitation = precipitation6;

                Location = "Key West, FL";
                break;

            case 7:

                temperature = temperature7;

                precipitation = precipitation7;

                Location = "Miami, FL";
                break;

            case 8:

                temperature = temperature8;

                precipitation = precipitation8;

                Location = "Orlando, FL";
                break;

            case 9:

                temperature = temperature9;

                precipitation = precipitation9;

                Location = "Pensacola, FL";
                break;

            case 10:

                temperature = temperature10;

                precipitation = precipitation10;

                Location = "Tallahassee, FL";
                break;

            case 11:

                temperature = temperature11;

                precipitation = precipitation11;

                Location = "West Palm Beach, FL";
                break;

            case 12:

                temperature = temperature12;

                precipitation = precipitation12;

                Location = "Vero Beach, FL";
                break;

            default:

                System.out.println("Sorry! Not a city provided");
                break;

        }




        if(temp.equalsIgnoreCase("C")){ // if the user chooses celsius and centimeter

            DeclareArrays.conversion(); // method declared in DreclareArrays. This method takes the array and converts the units from F and in to C and cm and stores them in two different arrays called celsius and centimeter

            temperature = (celsius);// celsius and centimeter arrays are both being stored in the temperature and precipitation arrays.

            precipitation = (centimeter);
        }

        for(int i = 0; i<temperature.length; i++){ // This loop calculates averages by adding each individual element.

            average+=temperature[i]/12;

            average = Math.round(average);

            annual+=precipitation[i]/12;

            annual = Math.round(annual);

        }




        if(city<13 && temp.equalsIgnoreCase("C") || temp.equalsIgnoreCase("F"))     {


            System.out.println("*******************************************************************************************");

            System.out.println("                      Climate Data                               ");

            System.out.println(" ");

            System.out.println("                Location: " +   Location                                               );

            System.out.println(" ");

            System.out.println('\t' + "Month" +'\t' + '\t' + "Temperature"+ '\t' + '\t' + "Precipitation ");

            System.out.println(" ");


            for (int i = 0; i<months.length; i++) {

                System.out.printf('\t' + months[i] + '\t' + '\t' + temperature[i]  + '\t' + '\t' + '\t' + precipitation[i]);

                System.out.print(" ");

            }

            System.out.println("*******************************************************************************************");

            System.out.println('\t'  + "       average:" + average +'\t' + '\t' +  "annual: " + annual);


        }


    }

}

