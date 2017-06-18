package computerscience;

import java.util.ArrayList;

/**
 * Created by Aditya Pratap on 6/16/2017.
 * <p>
 * The purpose of this program is to
 */
public class CO2FootPrintTester {

    public static void main(String args[]){

        ArrayList<CO2FootPrint> wasteCO2 = new ArrayList<CO2FootPrint>();

        wasteCO2.add(new CO2FootPrint(2345.67, 99.87, 0.16112, 4, true, true, true, true,  4 ));
        wasteCO2.add(new CO2FootPrint(2256.78, 108.9, 0.16209, 4, true, true, true, true,  3 ));


        CO2FootPrint caller;

        for (CO2FootPrint print: wasteCO2){

            caller = print;
            caller.calcGrossEmission();
            caller.calcWasteReduction();
            caller.calcWasteEmissions();
        }

        System.out.println("|             Pounds of CO2                |       Pounds of CO2         |                     |");
        System.out.println("|             Emitted From                 |       Reduced From          |                     |");
        System.out.println("|   Gas      |   Electricity   |   Waste   |  Recycling   | New Bulbs    |    CO2 Footprint    |");

        for (CO2FootPrint print : wasteCO2) {
            caller = print;
            System.out.printf("| %10.2f | %13.2f   | %9.2f | %12.2f | %10.2f   |     %10.2f     |\n", caller.calcPoundsOfCO2FromGas(),
                    caller.calculateElectricity(), caller.getGrossEmission(),
                    caller.getWasteReduction(), caller.calcBulbReduction(),
                    caller.getTotalEmission());
        }

    }
}
