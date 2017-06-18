/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.math.BigInteger;
import java.lang.Math;
import java.util.Scanner;


public class WeightOnPlanetsV1 {

    static double earthweight;

    double planetweight, mass, surfacegravity, gravityconstant;

    static int planet;

    static Scanner input = new Scanner(System.in);

    public static void calculateWeight() {

        System.out.println("Enter your Earth weight in pounds");

        earthweight = input.nextDouble();

        System.out.println();

        System.out.println("Select the planet of interest");

        System.out.println();

        System.out.println("[1] Mercury");

        System.out.println();

        System.out.println("[2] Venus");

        System.out.println();

        System.out.println("[3] Mars");

        System.out.println();

        System.out.println("[4] Jupiter");

        System.out.println();

        System.out.println("[5] Saturn");

        System.out.println();

        System.out.println("[6] Uranus");

        System.out.println();

        System.out.println("[7] Neptune");

        System.out.println();

        System.out.println("[8] or print all surface gravitieas and weights at once");

        System.out.println();

        planet = input.nextInt();

        SurfaceGravity.calculate();

        System.out.println();

    }

}

