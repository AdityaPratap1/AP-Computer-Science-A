/**
 * Created by Aditya Pratap on 6/18/2017.
 * <p>
 * The purpose of this program is to
 */
import java.util.Scanner;
import java.util.Random;

public class LotteryOdds {

    public static void calculate() 	{

        Scanner input = new Scanner(System.in);

        Random random = new Random();

        String LotteryNumber = "";


        for(int i = 0; i < 3; i++) {

            int randomNum = random.nextInt(999)+000;

            LotteryNumber = Integer.toString(randomNum);
        }


        System.out.print("Please enter your three numbers (e.g. 123): ");

        String number = input.nextLine();

        System.out.println(" ");

        System.out.println("Winning Lottery Number: " + LotteryNumber);


        if(number.equals(LotteryNumber)){

            System.out.println(" ");

            System.out.print("Congratulations, both pairs matched.");

        }else if(number.substring(0, 2).equals(LotteryNumber.substring(0, 2))){

            System.out.println(" ");

            System.out.print("Congratulations, the front pair matched.");

        }else if(number.substring(1, 3).equals(LotteryNumber.substring(1, 3))){

            System.out.println(" ");

            System.out.print("Congratulations, the end pair matched.");

        }else{

            System.out.println(" ");

            System.out.print("Sorry, no matches.");

        }
    }
}
