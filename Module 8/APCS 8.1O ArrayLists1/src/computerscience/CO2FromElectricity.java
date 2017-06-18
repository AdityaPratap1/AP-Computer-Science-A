package computerscience;

import java.util.ArrayList;

/**
 * Created by Aditya Pratap on 6/15/2017.
 *
 * The purpose of this program is to
 */

public class CO2FromElectricity {

    public double calculateAverageBill(ArrayList<Double> monthlyBill){

          double total = 0;
          for(double d : monthlyBill){
              total += d;
          }
          return total/monthlyBill.size(); // The default size of an ArrayList is 10
    }

    public double calculateAveragePrice(ArrayList<Double> monthlyPrice){
        double total = 0;
        for(double d : monthlyPrice){
            total += d;
        }
        return total/monthlyPrice.size();
    }

    public double calculateElectricity(double bill, double price){


        return (bill/price) * 1.37 * 12;

    }


}
