/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;

public class CarV3{

    private Scanner input = new Scanner(System.in);

    static double milesDriven1, startMiles1, endMiles1, gallons1, milage1, distance1, mpg1;

    static String carType1;

    static String line1 = " ";

    CarV3(){

    }

    public double calculateDistance(double startMiles1, double endMiles1){

        distance1 = endMiles1 - startMiles1;

        return distance1;

    }


    public double calculateMpg(double distance1, double gallons1){

        mpg1 = distance1/gallons1;

        return mpg1;


    }


    public void askQuestions(){


        System.out.println("What is the name of your car?");

        carType1 = input.nextLine();

        System.out.println("What are the miles when started?");

        startMiles1 = input.nextDouble();

        System.out.println("What are the miles when you ended?");

        endMiles1 = input.nextDouble();

        System.out.println("How many gallons used?");

        gallons1 = input.nextDouble();


    }

    public static void printEverything(){


        CarV3 car1 = new CarV3();

        distance1 = car1.calculateDistance(startMiles1, endMiles1);

        mpg1 = car1.calculateMpg(distance1, gallons1);

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

        System.out.printf("%14f", startMiles1);

        System.out.printf("%13f", endMiles1);

        System.out.printf("%12f", distance1);

        System.out.printf("%11.1f", gallons1);

        System.out.printf("%12.1f", mpg1);

    }

}


