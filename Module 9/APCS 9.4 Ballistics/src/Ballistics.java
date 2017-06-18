import java.lang.Math;

/**
 * Created by Aditya Pratap on 6/16/2017.
 * <p>
 * The purpose of this program is to
 */
public class Ballistics {

    private double gravity = 32.4, range;


    public double calculateRange(double mph, double angle){

        range = ((Math.pow(mph, 2))*Math.sin(2*(Math.toRadians(angle))))/gravity;
        return range;

    }
}
