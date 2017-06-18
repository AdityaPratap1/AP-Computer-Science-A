/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;

import java.util.Random;

public class GuessingGameV1 extends GuessingGameV2{

    public static void G1() {

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;


        System.out.println("Hello! welocome to the random number guessing game! Guess a number between 1 and 100 and i will give you the result! (Enter only integers)");

        System.out.println(" ");

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

                    System.out.println(" Sorry, Too high!");

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

                    System.out.println(" Sorry, Too high!");

                    System.out.println(" ");


                }              else {

                    System.out.println("Sorry, too low!");

                    System.out.println(" ");

                }


            } while (number != randomNumber);



        }

    }


}

