/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.lang.Math;

public class CO2FootPrintV1{

    private static double yearlyGasUsage;
    private static double annualEmissions;
    private static double annualEmissionsInPounds;
    private static double metricTons = Math.pow(10, -3);

    public CO2FootPrintV1(double annualGasUsage ){

        this.yearlyGasUsage = annualGasUsage;

    }

    public static void  calculateCo2Emisions(){

        annualEmissions = (metricTons * yearlyGasUsage);

        annualEmissionsInPounds = annualEmissions * 2204;

    }

    public static double getEmissionsTons(){


        return annualEmissions;

    }

    public static double getEmissionsPounds(){

        return annualEmissionsInPounds;

    }

    public static void print(){

        System.out.println(yearlyGasUsage);
    }
}