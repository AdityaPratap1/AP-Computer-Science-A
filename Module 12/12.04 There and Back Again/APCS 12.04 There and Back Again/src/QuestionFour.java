import java.util.Scanner;

/**
 * Created by Aditya Pratap on 6/17/2017.
 * <p>
 * The purpose of this program is to
 */
public class QuestionFour {

    public static void main(String args[]){

        System.out.println("Enter a number to be inputed for x");

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();

        QuestionFour object = new QuestionFour();

        System.out.println(object.translatePieceWise(x));

    }

    public double translatePieceWise(double number){

        if(number > 20){
            return -100;
        }

        else{

            return translatePieceWise(number * 2) - 4;
        }

    }
}


