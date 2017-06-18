/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.List;

import java.util.ArrayList;

public class SurfaceGravity extends WeightOnPlanetsV1{



    static double surfaceGravity;


    static double[] radius = new double[] {0.383, 0.949, 0.532, 11.21, 9.45, 4.01, 3.88 }; // this is a ratio compared to Earth's radius

    static double[] mass = new double[] {0.0553, 0.815, 0.107, 317.8, 95.2, 14.5, 17.1}; // this a ratio compared to Earth's mass

    static String[] planetNames = new String[] {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    static double[] surfaceg = new double[] {(mass[0])/Math.pow(radius[0], 2), (mass[1])/Math.pow(radius[1], 2), (mass[2])/Math.pow(radius[2], 2), (mass[3])/Math.pow(radius[3], 2), (mass[4])/Math.pow(radius[4], 2), (mass[5])/Math.pow(radius[5], 2), (mass[6])/Math.pow(radius[6], 2)};

    static double grams = 433.59237;

    static double mass1 = (earthweight *grams)/1;

    static double[] wt =  new double[] {(mass1 * surfaceg[0])/grams, (mass1 * surfaceg[1])/grams, (mass1 * surfaceg[2])/grams, (mass1 * surfaceg[3])/grams, (mass1 * surfaceg[4])/grams, (mass1 * surfaceg[5])/grams, (mass1 * surfaceg[6])/grams};

    static double weightonplanet;


    public static void calculate(){ // calculate surface gravity


        switch(planet){

            case 1: surfaceGravity = (mass[0])/Math.pow(radius[0], 2);

                System.out.printf("The surface gravity is %f grams", surfaceGravity);

                weightonplanet = (mass1 * surfaceGravity)/grams;

                System.out.println(" ");

                System.out.printf("You will weigh %f pounds", weightonplanet);

                //wt = {weightonplanet};


                break;

            case 2:surfaceGravity = (mass[1])/Math.pow(radius[1], 2);

                System.out.printf("The surface gravity is %f grams", surfaceGravity);

                weightonplanet = (mass1 * surfaceGravity)/grams;

                System.out.println(" ");

                System.out.printf("You will weigh %f pounds", weightonplanet);


                break;


            case 3: surfaceGravity = (mass[2])/Math.pow(radius[2], 2);

                System.out.printf("The surface gravity is %f grams", surfaceGravity);

                weightonplanet = (mass1 * surfaceGravity)/grams;

                System.out.println(" ");

                System.out.printf("You will weigh %f pounds", weightonplanet);


                break;


            case 4: surfaceGravity = (mass[3])/Math.pow(radius[3], 2);

                System.out.printf("The surface gravity is %f grams", surfaceGravity);

                weightonplanet = (mass1 * surfaceGravity)/grams;

                System.out.println(" ");

                System.out.printf("You will weigh %f pounds", weightonplanet);


                break;

            case 5: surfaceGravity = (mass[4])/Math.pow(radius[4], 2);

                System.out.printf("The surface gravity is %f grams", surfaceGravity);

                weightonplanet = (mass1 * surfaceGravity)/grams;

                System.out.println(" ");

                System.out.printf("You will weigh %f pounds", weightonplanet);


                break;


            case 6: surfaceGravity = (mass[5])/Math.pow(radius[5], 2);

                System.out.printf("The surface gravity is %f grams", surfaceGravity);

                weightonplanet= (mass1 * surfaceGravity)/grams;

                System.out.println(" ");

                System.out.printf("You will weigh %f pounds", weightonplanet);

                break;


            case 7:surfaceGravity = (mass[6])/Math.pow(radius[6], 2);

                System.out.printf("The surface gravity is %f grams", surfaceGravity);

                weightonplanet = (mass1 * surfaceGravity)/grams;

                System.out.println(" ");

                System.out.printf("You will weigh %f pounds", weightonplanet);

                break;

            case 8: SurfaceGravity.calculatewhole();

                break;


            default: System.out.println("Enter a valid option");


        }

    }

    public static void calculatewhole() {

        System.out.println("Planets" + '\t' + '\t' + "surfaceGravity (grams)" + '\t' + '\t'+ "Weight(lbs)");

        System.out.print("*******************************************************************");


        for(int i = 0; i<radius.length; i++) {


            System.out.println();

            System.out.println( planetNames[i] + '\t' + '\t' + surfaceg[i] + '\t' + '\t' + Math.round(wt[i]) + '\t' + " rounded weight" );

        }

    }


}