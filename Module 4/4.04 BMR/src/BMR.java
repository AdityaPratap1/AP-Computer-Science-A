/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;
import java.lang.Math;


public class BMR {



    public static void main(String[] args) {

        System.out.println("Basal metabolic rate is the amount of energy expressed in calories that a person needs to keep the body functioning at rest. ");

        Scanner input = new Scanner(System.in);

        System.out.println("");

        System.out.println("Enter name :");

        String name = input.nextLine();

        System.out.println();

        System.out.println("Enter biological Gender (M OR F)");

        String gender = input.nextLine();

        System.out.println("Enter age: ");

        int age = input.nextInt();

        System.out.println("Enter your height in inches: ");

        double height = input.nextDouble();

        System.out.println("Enter weight in pounds : ");

        double weight = input.nextDouble();


        double mass = weight * 0.453592;

        double centimeter = height * 2.54;

        if (gender.equals("M") || gender.equals("m")) {

            double P = (((13.397*(mass))/1) + ((4.799*(centimeter))/1) - ((6.7550*(age))/1) + (66.4730)); // source = wikipedia as given in assignment instructions

            System.out.println("Your name is: " + name);

            System.out.println("You are " + age + " years old");

            System.out.println("Your height in inches is " + height);

            System.out.println("Your height in centimeters is " + centimeter);

            System.out.println("Your weight in pounds is " + weight);

            System.out.println("Your weight in kilograms is " + mass);

            System.out.println("Your BMR is approximately " + Math.round(P) + " Calories/Day");



        }

        else if (gender.equals("F") || gender.equals("f")) {


            double P2 = (((9.247*(mass))/1) + ((3.098*(centimeter))/1) - ((4.330*(age))/1) + (447.593));

            System.out.println("Your name is: " + name);

            System.out.println("You are " + age + " years old");

            System.out.println("Your height in inches is " + height);

            System.out.println("Your height in centimeters is " + centimeter);

            System.out.println("Your weight in pounds is " + weight);

            System.out.println("Your weight in kilograms is " + mass);

            System.out.println("Your BMR is approximately " + Math.round(P2) + " Calories/Day");

            System.out.println(P2);


        }

        else {


            System.out.println("sorry! " + gender + " is not a given gender, run program again!");

        }



    }
}


