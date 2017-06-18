import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

/**
 * Created by Aditya Pratap on 6/16/2017.
 * <p>
 * The purpose of this program is to
 */
public class BallisticsTester {

   // static double[] degrees = new double[]{20, 25, 30, 35, 40, 45, 50};

    //static double[] MPH = new double[]{20, 25, 30, 35, 40, 45, 50};

    static  double[] radians;

    static double[][] ranges;

    static Ballistics object = new Ballistics();

    static UserInput obj = new UserInput();



    public static void main(String args[]){

        obj.askQuestions();

        radians = new double[obj.getLimit()];

        ranges = new double[obj.getLimit()][obj.getLimit()];

        for(int i = 0; i < radians.length; i++){

            radians[i] = Math.toRadians(obj.getAngles()[i]);

        }

        //i = mph, j = angle
        for(int i = 0; i < radians.length; i++){

            for(int j = 0; j < radians.length; j++) {

                ranges[i][j] = object.calculateRange(obj.getVelocities()[i], radians[j]);  // for each mph (i), insert an angle(j)
                // There are 7 mph but 49 range measure since each mph has 7 angles
            }

        }

        System.out.print("MPH (deg)");

        for(double i : obj.getAngles()) {

            System.out.print( "      " + i + "           ");
        }

        for(int i = 0; i < radians.length; i++){
            System.out.println();
            System.out.print(obj.getVelocities()[i] + "  ");
            System.out.print(Arrays.toString(ranges[i]));
        }

    }
}