import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Aditya Pratap on 6/17/2017.
 * <p>
 * The purpose of this program is to
 */
public class UserInput {

    Scanner input= new Scanner(System.in);

    //Angles

    int limitAng;

    double[] angles;

    //Velocities

    double[] velocities;

    public void askQuestions(){


        // Ask Angles

        System.out.println("Enter number of angles"); // Enter the max number of angles you want to calculate the range for

        limitAng = input.nextInt();

        angles = new double[limitAng];

        System.out.println("Enter" + limitAng +  "Angle Maesures"); // enter angle measures in degrees with space in between

        for(int i =0; i<limitAng; i++) {

            angles[i]  = Double.parseDouble(input.next());

        }

       // Ask Velocities

        velocities = new double[limitAng];

        System.out.println("Enter 7 initial Velocities");
        for(int i =0; i<limitAng; i++) {

            velocities[i]  = Double.parseDouble(input.next());

        }
    }



    public double[] getAngles(){
        return angles;
    }

    public double[] getVelocities(){
        return velocities;
    }

    public int getLimit(){
        return limitAng;
    }
}



