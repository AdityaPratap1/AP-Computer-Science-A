/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;

public class TargetZone {

    public static void main(String[] args) {

        int age = 0;
        int exerciseRate = 0;
        double maxHeartRate = 0;
        double hReserve = 0;
        double lowerEndZone = 0;
        double upperEndZone = 0;
        int restingRate = 0;
        int decision = 0;

        maxHeartRate = 206.9-(.067*age);

        hReserve = maxHeartRate - restingRate;

        lowerEndZone = (hReserve * .65)+ restingRate;

        upperEndZone = (hReserve * .85) + restingRate;


        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age : ");

        age = input.nextInt();

        System.out.println();

        System.out.println("Enter resting heart rate: ");

        restingRate = input.nextInt();

        System.out.println();

        System.out.println("Hit 1 if done with exercise , hit 2 if exercising or hit 3 if starting exercise");

        decision = input.nextInt();

        if (decision == 1 ) {

            System.out.println("What was your max heart rate during your exercise: ");

            maxHeartRate = input.nextInt();

            if (maxHeartRate > upperEndZone){

                System.out.println("Your heart rate was above target zone range! You worked a little too hard");
            }

            else if(maxHeartRate < lowerEndZone){

                System.out.println("Your heart rate was below target zone range. From next time, push it to the limit!");
            }

            else {

                System.out.println(" Your heart rate was inside target zone range! Good Job!");

            }

        }

        else if(decision == 2) {

            System.out.println("Enter heart rate during excercise: ");

            exerciseRate = input.nextInt();

            System.out.println(" your target heart rate should be between " + lowerEndZone + " and " + upperEndZone);

            if(exerciseRate > upperEndZone){


                System.out.println("Slow down! Exceeding Target Heart rate");

            } else if(exerciseRate < lowerEndZone ) {

                System.out.println("Increas intensity! Heart rate below target ");

            } else {

                System.out.println("That's perfect, keep it up!");
            }

        }

        else if(decision == 3){


            System.out.println("Let's get started!!");

            System.out.println();

            System.out.println(" your target heart rate should be " + lowerEndZone + " and " + upperEndZone);

            System.out.println();

        }

        else  {

            System.out.println("Enter 1, 2 or 3 only");

        }
    }

}

