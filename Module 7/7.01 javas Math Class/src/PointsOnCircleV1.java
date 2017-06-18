/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.lang.Math;
import java.util.Scanner;

public class PointsOnCircleV1{

    Scanner input = new Scanner(System.in);

    double radius =1.0;

    double[] numbers = {1.0, .90, .70, .60, .50, .40, .30, .20, .10, 0.0, -.10, -.20, -.30, -.40, -.50, -.60, -.70, -.80, -.90, -1.0};

    public void method() {

        for(int x =0; x<numbers.length; x++){

            double y1 = Math.sqrt(Math.pow(radius, 2) - Math.pow(numbers[x], 2));

            double y2 = 0.00;

            if (y1 != 0.00) {

                y2 = (-y1);

            }

            System.out.printf("%10.2f%10.2f%10.2f%10.2f%n", numbers[x], y1, numbers[x], y2);

            System.out.println(" ");

        }
    }
}
