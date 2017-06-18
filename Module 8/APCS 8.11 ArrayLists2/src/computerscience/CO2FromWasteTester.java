package computerscience;

import java.util.ArrayList;

/**
 * Created by Aditya Pratap on 6/15/2017.
 * <p>
 * The purpose of this program is to
 */
public class CO2FromWasteTester {

    public static void main(String args[]) {

        ArrayList<CO2FromWaste> objectArray = new ArrayList<CO2FromWaste>();

        objectArray.add(new CO2FromWaste(3, true, false, true, true));
        objectArray.add(new CO2FromWaste(7, false, false, true, false));
        objectArray.add(new CO2FromWaste(3, true, true, false, true));
        objectArray.add(new CO2FromWaste(2, true, false, false, false));
        objectArray.add(new CO2FromWaste(4, false, true, true, true));

        System.out.println("|       |        |                                 |          Pounds of CO2           |");
        System.out.println("|       |        |    Household Waste Recycled     |  Total   |            |    Net   |");
        System.out.println("| Index | People | Paper | Plastic | Glass |  Cans | Emission |  Reduction | Emission |");

        CO2FromWaste CO2WasteObj;

        for (CO2FromWaste CO2waste : objectArray) {
            CO2WasteObj = CO2waste;
            CO2WasteObj.calcGrossEmission();
            CO2WasteObj.calcWasteReduction();
            CO2WasteObj.calcWasteEmissions();
        }


        for (int index = 0; index < objectArray.size(); index++) {
            CO2WasteObj = objectArray.get(index);
            System.out.printf("%5d %8d %9b %8b %8b" + " %8b %9.2f %10.2f %12.2f\n", index,
                    CO2WasteObj.getNumOfPpl(), CO2WasteObj.getRecPaper(),
                    CO2WasteObj.getRecPlastic(), CO2WasteObj.getRecGlass(),
                    CO2WasteObj.getRecCans(), CO2WasteObj.getGrossEmission(),
                    CO2WasteObj.getWasteReduction(), CO2WasteObj.getTotalEmission());
        }

    }

}