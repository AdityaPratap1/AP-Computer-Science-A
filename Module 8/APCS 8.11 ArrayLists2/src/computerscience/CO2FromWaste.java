package computerscience;

/**
 * Created by Aditya Pratap on 6/15/2017.
 * <p>
 * The purpose of this program is to
 */
public class CO2FromWaste {

    private int numOfPpl, grossEmission;

    private boolean recPaper, recGlass, recPlastic, recCans;

    private double totalEmissions, wasteReduction;

    public CO2FromWaste(int people, boolean paper, boolean plastic, boolean glass, boolean cans){

        this.numOfPpl = people;
        this.recCans = cans;
        this.recGlass = glass;
        this.recPlastic = plastic;
        this.recPaper = paper;

    }

    public int getNumOfPpl(){
        return numOfPpl;
    }

    public boolean getRecPaper(){
        return recPaper;
    }

    public boolean getRecGlass(){
        return recGlass;
    }

    public boolean getRecPlastic(){
        return recPlastic;
    }

    public boolean getRecCans(){
        return recCans;
    }

    public void calcGrossEmission(){
        grossEmission = numOfPpl*1018;
    }

    public void calcWasteReduction(){

         wasteReduction = 0;

        if(recPaper){
            wasteReduction = (numOfPpl * 184);
        }

        if(recPlastic){
            wasteReduction = (numOfPpl * 25.6);
        }

        if(recGlass){
            wasteReduction = (numOfPpl* 46.6);
        }

        if (recCans){
            wasteReduction = (numOfPpl * 165.8);
        }

    }

    public void calcWasteEmissions(){
        calcGrossEmission();
        calcWasteReduction();
        totalEmissions = grossEmission - wasteReduction;

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
