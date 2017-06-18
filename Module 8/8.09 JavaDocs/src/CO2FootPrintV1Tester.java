/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Arrays;

public class CO2FootPrintV1Tester{

    private static double amountsOfGas = 1077.9;

    public static void main1(){

        String[] header = new String[] {" Gallons of Gas   ", "Pounds from Gas   ", "Tons from Gas   "};

        CO2FootPrintV1[] array = {new CO2FootPrintV1(amountsOfGas)};

        CO2FootPrintV1.calculateCo2Emisions();

        double emissionsInTons = CO2FootPrintV1.getEmissionsTons();

        double emissionsInPounds = CO2FootPrintV1.getEmissionsPounds();

        double[] info = new double[] {amountsOfGas, emissionsInPounds, emissionsInTons};

        System.out.println("\t" + "\t" + "CO2 Emissions");

        System.out.println();

        System.out.println(Arrays.toString(header));

        System.out.println();

        for(int i = 0; i<info.length; i ++){

            System.out.print(("\t" + info[i] + "\t"));

        }



    }


}