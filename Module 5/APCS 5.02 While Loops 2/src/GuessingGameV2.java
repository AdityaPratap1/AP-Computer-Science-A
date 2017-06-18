/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;

import java.util.Random;



public class GuessingGameV2{

    public static void G2() {

        Scanner input = new Scanner(System.in);

        Random random = new Random();


        System.out.println("Hello! welocome to the random number guessing game! Here, you can set the guessing range yourself and guess the number between that range! (Enter only integers)");

        System.out.println(" ");

        System.out.println("Enter max value of your range: ");

        int maxVal = input.nextInt();

        System.out.println("Enter the min value of your range : ");

        int minVal = input.nextInt();

        int randomNumber = random.nextInt(maxVal) + minVal;

        System.out.println(" ");

        System.out.println(" In your specified range the maximum value is " + maxVal + " and the minimum value is " + minVal);

        System.out.println("Enter your guess: ");

        System.out.println(" ");

        int number = input.nextInt();

        if (number == randomNumber){

            System.out.println("Nice guess!");
        }
        else if (number > randomNumber){

            System.out.println("Sorry, too high!");

            System.out.println(" ");

            do{

                System.out.println("Enter your guess: ");

                System.out.println(" ");

                number = input.nextInt();


                if (number == randomNumber){ // loops until input is equal to the random number, if true then :

                    System.out.println("Nice guess!");

                }   else if (number > randomNumber) {

                    System.out.println(" Sorry, too high!");

                    System.out.println(" ");


                }   else {

                    System.out.println("Sorry, too low!");

                    System.out.println(" ");

                }

            } while(number != randomNumber);


        }
        else {

            System.out.println("Sorry, too low!");

            System.out.println(" ");

            do{

                System.out.println("Enter your guess: ");

                System.out.println(" ");

                number = input.nextInt();


                if (number == randomNumber){

                    System.out.println("Nice guess!");


                }

                else if (number > randomNumber) {

                    System.out.println(" Sorry, too high!");

                    System.out.println(" ");


                }              else {

                    System.out.println("Sorry too low!");

                    System.out.println(" ");

                }


            } while (number != randomNumber);



        }

    }


}