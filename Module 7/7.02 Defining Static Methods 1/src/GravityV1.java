/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.math.BigInteger;
import java.lang.Math;
import java.util.Scanner;

public class GravityV1{

    Scanner input = new Scanner(System.in);

    int planet;

    double surfaceGravity;

    double gravitationalConstant = (6.67 * (Math.pow(10, -11)));

    double constant = Math.pow(10, 24);

    int[] radius = new int[] {2440000, 6052000, 6378000, 3396000, 71492000, 60268000, 25559000, 24764000 }; // meters

    double[] mass = new double[] {0.33*constant, 4.87*constant, 5.97*constant, 0.642*constant, 1898*constant, 596 * constant, 86.8*constant, 102*constant};

    String[] planetNames = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    public void calculate(){ // calculate surface gravity

        System.out.println("[1] Mercury");

        System.out.println();

        System.out.println("[2] Venus");

        System.out.println();

        System.out.println("[3] Earth");

        System.out.println();

        System.out.println("[4] Mars");

        System.out.println();

        System.out.println("[5] Jupiter");

        System.out.println();

        System.out.println("[6] Saturn");

        System.out.println();

        System.out.println("[7] Uranus");

        System.out.println();

        System.out.println("[8] Neptune");

        System.out.println();

        System.out.println("[9] or print all surface gravitieas at once");

        System.out.println();

        planet = input.nextInt();

        switch(planet){

            case 1: surfaceGravity = (gravitationalConstant * mass[0])/Math.pow(radius[0], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 2: surfaceGravity = (gravitationalConstant * mass[1])/Math.pow(radius[1], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 3: surfaceGravity = (gravitationalConstant * mass[2])/Math.pow(radius[2], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 4: surfaceGravity = (gravitationalConstant * mass[3])/Math.pow(radius[3], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 5: surfaceGravity = (gravitationalConstant * mass[4])/Math.pow(radius[4], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 6: surfaceGravity = (gravitationalConstant * mass[5])/Math.pow(radius[5], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 7: surfaceGravity = (gravitationalConstant * mass[6])/Math.pow(radius[7], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 8: surfaceGravity = (gravitationalConstant * mass[7])/Math.pow(radius[7], 2);

                System.out.printf("The surface gravity is %f m/s^2", surfaceGravity);

                break;

            case 9: GravityV1 object = new GravityV1();

                object.calculatewhole();

                break;



            default: System.out.println("Enter a valid option");
        }

    }

    public void calculatewhole() {

        System.out.println("Planets" + '\t' + '\t' + "Diameter" + '\t'  + "Mass");

        System.out.print("*******************************************************************");


        for(int i = 0; i<radius.length; i++) {

            double  rad = radius[i]/1000;

            System.out.println();

            System.out.println(planetNames[i] + '\t' + '\t' + rad + '\t' + '\t' + mass[i]);

        }
    }

}