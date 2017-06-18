package computerscience;


import java.util.ArrayList;

/**
 * Created by Aditya Pratap on 6/16/2017.
 * <p>
 * The purpose of this program is to
 */
public class CO2FootPrint {

     private double annGasoline, avgElecBill, avgElecPrice, wasteReduction, newBulbsReduc, grossEmission, totalEmissions, electricity;

     private int numPpl, newBulbs;

     private boolean recPaper, recGlass, recCans, recPlastic;

    public CO2FootPrint(double annualGasoline, double averageElectrcityBill, double averageElectricityPrice, int numberOfPeople, boolean paper,
                        boolean glass, boolean cans, boolean plastic, int bulbs){

        this.annGasoline = annualGasoline;
        this.avgElecBill = averageElectrcityBill;
        this.avgElecPrice = averageElectricityPrice;
        this.numPpl = numberOfPeople;
        this.newBulbs = bulbs;
        this.recPaper = paper;
        this.recGlass = glass;
        this.recCans = cans;
        this.recPlastic = plastic;

    }

    //copied form class CO2FromElectricity

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

    public double calculateElectricity(){

        electricity = (avgElecBill/avgElecPrice) * 1.37 * 12;
        return electricity;

    }


    // Copied from class CO2FromWaste
    public int getNumOfPpl(){
        return numPpl;
    }

    public boolean getRecPaper(){
        return recPaper;
    }

    public boolean getRecGlass(){
        return recGlass;
    }

    public  boolean getRecPlastic(){
        return recPlastic;
    }

    public  boolean getRecCans(){
        return recCans;
    }

    public  double getBulbReduc(){

        return newBulbsReduc;
    }


    public  double calcWasteReduction(){

         wasteReduction = 0;

        if(getRecPaper()){
            wasteReduction = (getNumOfPpl() * 184);
        }

        if(getRecPlastic()){
            wasteReduction = (getNumOfPpl() * 25.6);
        }

        if(getRecGlass()){
            wasteReduction = (getNumOfPpl()* 46.6);
        }

        if (getRecCans()){
            wasteReduction = (getNumOfPpl() * 165.8);
        }

        return wasteReduction;

    }




    public  double calcBulbReduction(){

        newBulbsReduc=  ((double) newBulbs * 1.37 * 73);

        return newBulbsReduc;
    }

    //CO2 from Gallons

    public  double getGallonsUsed(){
        return annGasoline;
    }

    public  double calcPoundsOfCO2FromGas(){

        return annGasoline * 8.7E-3* 2000;
    }

    public double calcGrossEmission(){
        grossEmission = numPpl*1018;

        return grossEmission;
    }

    public double calcWasteEmissions(){
        calcGrossEmission();
        calcWasteReduction();
        totalEmissions = calcGrossEmission()+ calcPoundsOfCO2FromGas() + calculateElectricity() - calcGrossEmission() - calcBulbReduction();
        return totalEmissions;

    }

    public double getGrossEmission(){
        return grossEmission;
    }

    public double getWasteReduction(){
        return wasteReduction;
    }

    public double getTotalEmission(){
        return totalEmissions;
    }

}
