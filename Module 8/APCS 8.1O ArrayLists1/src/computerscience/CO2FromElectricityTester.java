package computerscience;

import java.util.ArrayList;

/**
 * Created by Aditya Pratap on 6/15/2017.
 */
public class CO2FromElectricityTester {

    public static void main(String args[]){

      CO2FromElectricity object = new CO2FromElectricity();

        ArrayList<Double> yearLongBills = new ArrayList<>();

        // All the prices added to ArrayList. All prices are made up and are not subject to current actual electricity bill

        yearLongBills.add(100.76);
        yearLongBills.add(115.24);
        yearLongBills.add(123.98);
        yearLongBills.add(112.65);
        yearLongBills.add(119.75);
        yearLongBills.add(114.44);
        yearLongBills.add(111.11);
        yearLongBills.add(112.12);
        yearLongBills.add(107.45);
        yearLongBills.add(098.99);
        yearLongBills.add(100.45);

        double averageBill = object.calculateAverageBill(yearLongBills);

        ArrayList<Double> monthlyPrice = new ArrayList<>();

        monthlyPrice.add(0.1621);
        monthlyPrice.add(0.1622);
        monthlyPrice.add(0.1623);
        monthlyPrice.add(0.1631);
        monthlyPrice.add(0.1641);
        monthlyPrice.add(0.1611);
        monthlyPrice.add(0.1635);
        monthlyPrice.add(0.1621);
        monthlyPrice.add(0.1631);
        monthlyPrice.add(0.1629);
        monthlyPrice.add(0.1628);
        monthlyPrice.add(0.1624);

        double averagePrice = object.calculateAveragePrice(monthlyPrice);

        double emissions = object.calculateElectricity(averageBill, averagePrice);

        System.out.printf("The average monthly electricity bill: %3.2f dollars", averageBill);
        System.out.println();
        System.out.printf("The average monthly electricity price: %3.2f cents/kwh", averagePrice);
        System.out.println();
        System.out.printf("The average monthly emissions: %3.2f pounds", emissions);


    }

}
