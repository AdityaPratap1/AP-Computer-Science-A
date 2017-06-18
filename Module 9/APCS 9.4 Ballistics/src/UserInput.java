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
    String angle1, angle2, angle3, angle4, angle5, angle6, angle7;

    double  dAngle1, dAngle2, dAngle3, dAngle4, dAngle5, dAngle6, dAngle7;

    int limitAng;

    double[] angles;

    //Velocities

    String vel1, vel2, vel3, vel4, vel5, vel6, vel7;

    double dVel1, dVel2, dVel3, dVel4, dVel5, dVel6, dVel7;

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



