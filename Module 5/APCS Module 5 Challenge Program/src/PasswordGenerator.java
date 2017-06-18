/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    static Scanner input = new Scanner(System.in);

    static int choice;

    static Random rand = new Random();

    static int times;

    static String lowerCase = "abcdefghijklmnopqrstuvwxyz";

    static String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static String numbers = "1234567890";

    static String punctuation = "={}|[]:;@\\<>?`/~^_";

    static String password = "";

    static int loopSelect;

    static int generatePassword;



    public static void generate() {

        System.out.println(" ");

        System.out.println("Choose your preffered password encryption");

        System.out.println(" ");

        System.out.println("[1] Lowercase Letters ");

        System.out.println("[2] Lowercase and numbers");

        System.out.println("[3] Lowercase, Uppercase and numbers");

        System.out.println("[4] Lowercase, Uppercase, Numbers and punctuation");

        System.out.println("[5] QUIT ");

        System.out.println(" ");

        choice = input.nextInt();

        System.out.println("Enter length: ");

        times = input.nextInt();

        if (times < 6) {

            do {

                System.out.println("Sorry! minimum length is 6, Enter length: ");

                times = input.nextInt();

            } while(times < 6 && times != 6);

        }

        /////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////

        if (choice == 1) {

            for(int i = 0; i<times; i++) {

                password += lowerCase.charAt(rand.nextInt(lowerCase.length()));


            }

            System.out.println("Your new password is " + password);

            password = "";
        }

        else if (choice == 2){

            for(int i = 0; i<times; i++) {

                loopSelect = rand.nextInt(2);

                if (loopSelect == 0) {

                    password += lowerCase.charAt(rand.nextInt(lowerCase.length()));

                }

                if (loopSelect == 1){

                    password += UpperCase.charAt(rand.nextInt(UpperCase.length()));

                }

            }

            System.out.println("Your new password is " + password);

            password = "";
        }


        else if(choice == 3) {

            for(int i = 0; i<times; i++) {

                loopSelect = rand.nextInt(3);

                if (loopSelect == 0) {

                    password += lowerCase.charAt(rand.nextInt(lowerCase.length()));

                }

                if (loopSelect == 1){

                    password += UpperCase.charAt(rand.nextInt(UpperCase.length()));

                }

                if (loopSelect == 2) {

                    password += numbers.charAt(rand.nextInt(numbers.length()));

                }

            }

            System.out.println("Your new password is " + password);

            password = "";

        }

        else if (choice == 4) {

            for(int i = 0; i<times; i++) {

                loopSelect = rand.nextInt(4);

                if (loopSelect == 0) {

                    password += lowerCase.charAt(rand.nextInt(lowerCase.length()));

                }

                if (loopSelect == 1){

                    password += UpperCase.charAt(rand.nextInt(UpperCase.length()));

                }

                if (loopSelect == 2) {

                    password += numbers.charAt(rand.nextInt(numbers.length()));

                }

                if (loopSelect == 3) {

                    password += punctuation.charAt(rand.nextInt(punctuation.length()));

                }

            }

            System.out.println("Your new password is " + password);

            password = "";

        }

        else if (choice == 5){

            password = " ";

            System.out.println(" Sorry but you chose 5, quit and the program has ended :-(");

            password = "";
        }

        else {

            System.out.println("Enter a valid given number(1-5)");

        }

    }

}